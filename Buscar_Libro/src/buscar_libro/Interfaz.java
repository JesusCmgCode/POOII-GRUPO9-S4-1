
package buscar_libro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTextField isbnField;
    private JTextField tituloField;
    private JComboBox<String> autorComboBox;
    private JTextArea resultadoArea;
    private JButton buscarButton;
    private LibroManager libroManager;

    public Interfaz() {
        libroManager = new LibroManager();

        setTitle("Buscar Libro");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de búsqueda
        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new GridLayout(4, 2));

        panelBusqueda.add(new JLabel("ISBN:"));
        isbnField = new JTextField();
        panelBusqueda.add(isbnField);

        panelBusqueda.add(new JLabel("Título:"));
        tituloField = new JTextField();
        panelBusqueda.add(tituloField);

        panelBusqueda.add(new JLabel("Autor:"));
        autorComboBox = new JComboBox<>();
        libroManager.cargarAutores(autorComboBox);
        panelBusqueda.add(autorComboBox);

        buscarButton = new JButton("Buscar");
        panelBusqueda.add(buscarButton);

        add(panelBusqueda, BorderLayout.NORTH);

        // Área de resultados
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        add(scrollPane, BorderLayout.CENTER);

        // Acción del botón buscar
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarLibro();
            }
        });
    }

    private void buscarLibro() {
        String isbn = isbnField.getText().trim();
        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ISBN no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Libro libro = libroManager.buscarLibro(isbn);
        if (libro != null) {
            resultadoArea.setText(libro.toString());
        } else {
            resultadoArea.setText("No se encontró el libro con ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz frame = new Interfaz();
            frame.setVisible(true);
        });
    }
}
