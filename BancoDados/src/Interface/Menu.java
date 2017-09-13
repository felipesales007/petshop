package Interface;

import java.awt.Toolkit;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public final class Menu extends javax.swing.JFrame
{
    ////////////////////////////////CONEXÃO/////////////////////////////////////
    public class Conexao 
    {
        public Statement stm;//RESPONSAVEL POR PREPARAR E REALIZAR PESQUISA NO BANCO DE DADOS
        public ResultSet rs;//RESPONSAVEL POR ARMAZENAR O RESULTADO DE UMA PESQUISA PASSADA PARA O STATEMENT
        private final String driver = "com.mysql.jdbc.Driver";//RESPONSAVEL POR IDENTIFICAR O SERVIÇO DE BANCO DE DADOS

        private static final String login = "root";
        private static final String senha = "";

        public Connection conn;//RESPONSAVEL POR REALIZAR A CONEXÃO COM O BANCO DE DADOS

        public void conexao()//MÉTODO RESPONSAVEL POR REALIZAR A CONEXÃO COM O BANCO
        {
            try
            {
                System.setProperty("jdbc.Drivers",driver);//SETA A PROPRIEDADE DO DRIVER DE CONEXÃO
                conn = DriverManager.getConnection("jdbc:mysql://localhost/pet_shop", login, senha);//RESPONSAVEL POR SETAR O LOCAL DO BANCO DE DADOS
                //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");//IMPRIME UMA CAIXA DE MENSAGEM
            }
            catch(SQLException ex)//EXCESSÃO
            {
                JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro: " + ex.getMessage());
            }
        }
        
        public void desconecta()//MÉTODO PARA FECHAR A CONEXÃO CM O BANCO DE DADOS
        {
            try
            {
                conn.close();//FECHA A CONEXÃO
            }
            catch(SQLException ex)//EXCESSÃO
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n Erro: " + ex.getMessage());//IMPRIME UMA CAIXA DE MENSAGEM
            }
        }
    }
    Conexao conecta = new Conexao();
    ////////////////////////////////////////////////////////////////////////////
    public Menu()
    {
        initComponents();
        setIcon();
    }
    ////////////////////////////////////////////////////////////////////////////
    public void LimparCampos()
    {
        //LIMPA OS CAMPOS DE TEXTO
        nome_cliente_digitado.setText("");
        cpf_cliente_digitado.setText("");
        telefone_cliente_digitado.setText("");
        nome_pet_digitado.setText("");
        raca_pet_digitado.setText("");
        idade_pet_digitado.setText("");
        pesquisar_digitado.setText("");
    }
    
        //CRIAÇÃO DE UM ICONE
    private void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.jpg")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        pet_shopPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("pet_shopPU").createEntityManager();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : pet_shopPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        clientesQuery1 = java.beans.Beans.isDesignTime() ? null : pet_shopPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery1.getResultList();
        clientesQuery2 = java.beans.Beans.isDesignTime() ? null : pet_shopPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery2.getResultList();
        painel_fundo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        painel_menu = new javax.swing.JPanel();
        novo_botao = new javax.swing.JButton();
        salvar_botao = new javax.swing.JButton();
        editar_botao = new javax.swing.JButton();
        painel_dados = new javax.swing.JPanel();
        cliente_txt = new javax.swing.JLabel();
        cpf_txt = new javax.swing.JLabel();
        telefone_txt = new javax.swing.JLabel();
        nome_cliente_digitado = new javax.swing.JTextField();
        cpf_cliente_digitado = new javax.swing.JTextField();
        telefone_cliente_digitado = new javax.swing.JTextField();
        painel_pet = new javax.swing.JPanel();
        dog_cat = new javax.swing.JLabel();
        Pet_txt = new javax.swing.JLabel();
        raca_txt = new javax.swing.JLabel();
        idade_txt = new javax.swing.JLabel();
        nome_pet_digitado = new javax.swing.JTextField();
        raca_pet_digitado = new javax.swing.JTextField();
        idade_pet_digitado = new javax.swing.JTextField();
        id_cliente = new javax.swing.JTextField();
        painel_pesquisar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_dados = new javax.swing.JTable();
        pesquisar_digitado = new javax.swing.JTextField();
        consultar_botao = new javax.swing.JButton();
        excluir_botao = new javax.swing.JButton();
        cancelar_botao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PET SHOP");
        setResizable(false);

        painel_fundo.setBackground(new java.awt.Color(102, 102, 102));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N

        painel_menu.setBackground(new java.awt.Color(153, 153, 153));

        novo_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        novo_botao.setText("Novo");
        novo_botao.setToolTipText("Registrar cliente");
        novo_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_botaoActionPerformed(evt);
            }
        });

        salvar_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        salvar_botao.setText("Salvar");
        salvar_botao.setToolTipText("Salvar dados inseridos nos campos");
        salvar_botao.setEnabled(false);
        salvar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_botaoActionPerformed(evt);
            }
        });

        editar_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        editar_botao.setText("Alterar");
        editar_botao.setToolTipText("Alterar dados cadastrados");
        editar_botao.setEnabled(false);
        editar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_botaoActionPerformed(evt);
            }
        });

        painel_dados.setBackground(new java.awt.Color(255, 204, 204));

        cliente_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cliente_txt.setText("Cliente");

        cpf_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cpf_txt.setText("CPF");

        telefone_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        telefone_txt.setText("Telefone");

        nome_cliente_digitado.setToolTipText("Digite o nome do cliente");
        nome_cliente_digitado.setEnabled(false);

        cpf_cliente_digitado.setToolTipText("Digite o CPF do cliente");
        cpf_cliente_digitado.setEnabled(false);

        telefone_cliente_digitado.setToolTipText("Digite o telefone do cliente");
        telefone_cliente_digitado.setEnabled(false);

        painel_pet.setBackground(new java.awt.Color(255, 255, 255));

        dog_cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dog_cat.png"))); // NOI18N

        Pet_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Pet_txt.setText("Pet");

        raca_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        raca_txt.setText("Raça");

        idade_txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        idade_txt.setText("Idade");

        nome_pet_digitado.setToolTipText("Digite o nome do animal");
        nome_pet_digitado.setEnabled(false);

        raca_pet_digitado.setToolTipText("Digite a raça do animal");
        raca_pet_digitado.setEnabled(false);

        idade_pet_digitado.setToolTipText("Digite a idade do animal");
        idade_pet_digitado.setEnabled(false);

        javax.swing.GroupLayout painel_petLayout = new javax.swing.GroupLayout(painel_pet);
        painel_pet.setLayout(painel_petLayout);
        painel_petLayout.setHorizontalGroup(
            painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_petLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dog_cat)
                .addGap(18, 18, 18)
                .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raca_txt)
                    .addComponent(idade_txt)
                    .addComponent(Pet_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raca_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idade_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        painel_petLayout.setVerticalGroup(
            painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_petLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dog_cat)
                    .addGroup(painel_petLayout.createSequentialGroup()
                        .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pet_txt)
                            .addComponent(nome_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raca_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(raca_txt))
                        .addGap(18, 18, 18)
                        .addGroup(painel_petLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_pet_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_txt)))))
        );

        id_cliente.setEditable(false);
        id_cliente.setBackground(new java.awt.Color(255, 204, 204));
        id_cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_cliente.setForeground(new java.awt.Color(255, 204, 204));
        id_cliente.setCaretColor(new java.awt.Color(255, 204, 204));
        id_cliente.setDisabledTextColor(new java.awt.Color(255, 204, 204));
        id_cliente.setEnabled(false);
        id_cliente.setSelectionColor(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(503, 503, 503)
                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone_txt)
                    .addComponent(cpf_txt)
                    .addComponent(cliente_txt))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel_pet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cliente_txt)))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_txt)
                    .addComponent(cpf_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone_txt)
                    .addComponent(telefone_cliente_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painel_pet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_pesquisar.setBackground(new java.awt.Color(102, 102, 102));
        painel_pesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painel_pesquisar.setForeground(new java.awt.Color(51, 51, 51));

        tabela_dados.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        tabela_dados.setToolTipText("Clique no cliente para uma ação");
        tabela_dados.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tabela_dados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pet}"));
        columnBinding.setColumnName("Pet");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${raca}"));
        columnBinding.setColumnName("Raça");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idade}"));
        columnBinding.setColumnName("Idade");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tabela_dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_dadosMouseClicked(evt);
            }
        });
        tabela_dados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_dadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_dados);
        if (tabela_dados.getColumnModel().getColumnCount() > 0) {
            tabela_dados.getColumnModel().getColumn(0).setResizable(false);
            tabela_dados.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabela_dados.getColumnModel().getColumn(1).setResizable(false);
            tabela_dados.getColumnModel().getColumn(1).setPreferredWidth(260);
            tabela_dados.getColumnModel().getColumn(2).setResizable(false);
            tabela_dados.getColumnModel().getColumn(2).setPreferredWidth(125);
            tabela_dados.getColumnModel().getColumn(3).setResizable(false);
            tabela_dados.getColumnModel().getColumn(3).setPreferredWidth(125);
            tabela_dados.getColumnModel().getColumn(4).setResizable(false);
            tabela_dados.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabela_dados.getColumnModel().getColumn(5).setResizable(false);
            tabela_dados.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabela_dados.getColumnModel().getColumn(6).setResizable(false);
            tabela_dados.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        pesquisar_digitado.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        pesquisar_digitado.setForeground(new java.awt.Color(153, 153, 153));
        pesquisar_digitado.setText("Digite o nome do cliente");
        pesquisar_digitado.setToolTipText("Pesquise um cliente");
        pesquisar_digitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisar_digitadoMouseClicked(evt);
            }
        });

        consultar_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        consultar_botao.setText("Pesquisar");
        consultar_botao.setToolTipText("Pesquisar cliente registrado");
        consultar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_botaoActionPerformed(evt);
            }
        });

        excluir_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        excluir_botao.setText("Excluir");
        excluir_botao.setToolTipText("Excluir cliente");
        excluir_botao.setEnabled(false);
        excluir_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_botaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_pesquisarLayout = new javax.swing.GroupLayout(painel_pesquisar);
        painel_pesquisar.setLayout(painel_pesquisarLayout);
        painel_pesquisarLayout.setHorizontalGroup(
            painel_pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_pesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addGroup(painel_pesquisarLayout.createSequentialGroup()
                        .addComponent(pesquisar_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consultar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excluir_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painel_pesquisarLayout.setVerticalGroup(
            painel_pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_pesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar_digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_botao)
                    .addComponent(excluir_botao))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cancelar_botao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cancelar_botao.setText("Cancelar");
        cancelar_botao.setToolTipText("Cancelar a operação");
        cancelar_botao.setEnabled(false);
        cancelar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_botaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_menuLayout = new javax.swing.GroupLayout(painel_menu);
        painel_menu.setLayout(painel_menuLayout);
        painel_menuLayout.setHorizontalGroup(
            painel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_menuLayout.createSequentialGroup()
                        .addGroup(painel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novo_botao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salvar_botao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editar_botao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar_botao, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painel_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painel_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_menuLayout.setVerticalGroup(
            painel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_menuLayout.createSequentialGroup()
                        .addComponent(novo_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(editar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(salvar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cancelar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(painel_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_fundoLayout = new javax.swing.GroupLayout(painel_fundo);
        painel_fundo.setLayout(painel_fundoLayout);
        painel_fundoLayout.setHorizontalGroup(
            painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painel_fundoLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_fundoLayout.setVerticalGroup(
            painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novo_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_botaoActionPerformed
        novo_botao.setEnabled(false);
        salvar_botao.setEnabled(true);
        cancelar_botao.setEnabled(true);
        editar_botao.setEnabled(false);
        excluir_botao.setEnabled(true);
        nome_cliente_digitado.setEnabled(true);
        cpf_cliente_digitado.setEnabled(true);
        telefone_cliente_digitado.setEnabled(true);
        nome_pet_digitado.setEnabled(true);
        raca_pet_digitado.setEnabled(true);
        idade_pet_digitado.setEnabled(true);
        excluir_botao.setEnabled(false);
        pesquisar_digitado.setEnabled(false);
        consultar_botao.setEnabled(false);
        
        int row = clientesList.size() - 1;
        tabela_dados.setRowSelectionInterval(row, row);
        tabela_dados.scrollRectToVisible(tabela_dados.getCellRect(row, 0, true));
    }//GEN-LAST:event_novo_botaoActionPerformed

    private void cancelar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_botaoActionPerformed
        novo_botao.setEnabled(true);
        salvar_botao.setEnabled(false);
        cancelar_botao.setEnabled(false);
        editar_botao.setEnabled(false);
        excluir_botao.setEnabled(false);
        nome_cliente_digitado.setEnabled(false);
        cpf_cliente_digitado.setEnabled(false);
        telefone_cliente_digitado.setEnabled(false);
        nome_pet_digitado.setEnabled(false);
        raca_pet_digitado.setEnabled(false);
        idade_pet_digitado.setEnabled(false);
        consultar_botao.setEnabled(true);
        pesquisar_digitado.setEnabled(true);        
        
        LimparCampos();
    }//GEN-LAST:event_cancelar_botaoActionPerformed

    private void salvar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_botaoActionPerformed
        try 
        {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO clientes(Cliente, CPF, Telefone, Pet, Raca, Idade) VALUES(?,?,?,?,?,?)");//PASSAGEM DO SQL PARA INSERÇÃO
            //PASSAGEM DOS PARAMETROS
            pst.setString(1, nome_cliente_digitado.getText());
            pst.setString(2, cpf_cliente_digitado.getText());
            pst.setString(3, telefone_cliente_digitado.getText());
            pst.setString(4, nome_pet_digitado.getText());
            pst.setString(5, raca_pet_digitado.getText());
            pst.setString(6, idade_pet_digitado.getText());
            
            pst.executeUpdate();//EXECUTA A INSERÇÃO
            JOptionPane.showMessageDialog(rootPane, "Cliente salvo com sucesso!");
                     
            novo_botao.setEnabled(true);
            consultar_botao.setEnabled(true);
            pesquisar_digitado.setEnabled(true);
            salvar_botao.setEnabled(false);
            cancelar_botao.setEnabled(false);
            editar_botao.setEnabled(false);
            excluir_botao.setEnabled(false);
            nome_cliente_digitado.setEnabled(false);
            cpf_cliente_digitado.setEnabled(false);
            telefone_cliente_digitado.setEnabled(false);
            nome_pet_digitado.setEnabled(false);
            raca_pet_digitado.setEnabled(false);
            idade_pet_digitado.setEnabled(false);   
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!");
        }
        LimparCampos();
        conecta.desconecta();
    }//GEN-LAST:event_salvar_botaoActionPerformed

    private void excluir_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_botaoActionPerformed
        if(nome_cliente_digitado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Digite ou selecione o nome do cliente!");
        }
        else
        {
            try 
            {  
                conecta.conexao();
                java.sql.Statement stmt = conecta.conn.createStatement();  

                PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM clientes WHERE ID = '" + this.id_cliente.getText() + "'");    

                pst.executeUpdate();  
                JOptionPane.showMessageDialog(rootPane, "Cliente excluido com sucesso!");
                
                novo_botao.setEnabled(true);
                consultar_botao.setEnabled(true);
                pesquisar_digitado.setEnabled(true);
                salvar_botao.setEnabled(false);
                cancelar_botao.setEnabled(false);
                editar_botao.setEnabled(false);
                excluir_botao.setEnabled(false);
                nome_cliente_digitado.setEnabled(false);
                cpf_cliente_digitado.setEnabled(false);
                telefone_cliente_digitado.setEnabled(false);
                nome_pet_digitado.setEnabled(false);
                raca_pet_digitado.setEnabled(false);
                idade_pet_digitado.setEnabled(false);   
            } 
            catch (SQLException ex)
            {  
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente!\n Erro: " + ex.getMessage());
            }         
            LimparCampos();
            conecta.desconecta();
        }       
    }//GEN-LAST:event_excluir_botaoActionPerformed

    private void consultar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_botaoActionPerformed
        if(pesquisar_digitado.getText().equals("") || pesquisar_digitado.getText().equals("Digite o nome do cliente"))
        {
            LimparCampos();
            JOptionPane.showMessageDialog(null, "Nome em branco!");
        }
        else
        {
            novo_botao.setEnabled(false);
            salvar_botao.setEnabled(false);
            cancelar_botao.setEnabled(true);
            editar_botao.setEnabled(true);
            excluir_botao.setEnabled(true);
            nome_cliente_digitado.setEnabled(true);
            cpf_cliente_digitado.setEnabled(true);
            telefone_cliente_digitado.setEnabled(true);
            nome_pet_digitado.setEnabled(true);
            raca_pet_digitado.setEnabled(true);
            idade_pet_digitado.setEnabled(true);
            excluir_botao.setEnabled(true);
 
            try 
            {  
                conecta.conexao();
                String sql = "SELECT * FROM clientes WHERE Cliente = ?";                
                PreparedStatement pst = conecta.conn.prepareStatement(sql);
                pst.setString(1, pesquisar_digitado.getText());
                ResultSet resultado = pst.executeQuery();

                LimparCampos();

                if(resultado.next())
                {
                    id_cliente.setText(String.valueOf(resultado.getInt("ID")));
                    nome_cliente_digitado.setText(resultado.getString("Cliente"));
                    cpf_cliente_digitado.setText(String.valueOf(resultado.getInt("CPF")));
                    telefone_cliente_digitado.setText(String.valueOf(resultado.getInt("Telefone")));
                    nome_pet_digitado.setText(resultado.getString("Pet"));
                    raca_pet_digitado.setText(resultado.getString("Raca"));
                    idade_pet_digitado.setText(String.valueOf(resultado.getInt("Idade")));
                }     
            } 
            catch (SQLException ex)
            {  
                JOptionPane.showMessageDialog(null, "Erro ao consultar cliente!\n Erro: " + ex.getMessage());
            }
            if(nome_cliente_digitado.getText().equals(""))
            {
                LimparCampos();
                JOptionPane.showMessageDialog(null,"Cliente não existe");
            }
            conecta.desconecta();
        }     
    }//GEN-LAST:event_consultar_botaoActionPerformed

    private void editar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_botaoActionPerformed
        if(nome_cliente_digitado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Pesquise o nome do cliente para alterar!");
        }
        else
        {
            try 
            {  
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement("UPDATE clientes SET Cliente = ?, CPF = ?, Telefone = ?, Pet = ?, Raca = ?, Idade = ? WHERE ID = '" + this.id_cliente.getText() + "'");

                pst.setString(1, nome_cliente_digitado.getText());
                pst.setString(2, cpf_cliente_digitado.getText());
                pst.setString(3, telefone_cliente_digitado.getText());
                pst.setString(4, nome_pet_digitado.getText());
                pst.setString(5, raca_pet_digitado.getText());
                pst.setString(6, idade_pet_digitado.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(rootPane, "Cliente alterado com sucesso!");

                novo_botao.setEnabled(true);
                editar_botao.setEnabled(false);
                consultar_botao.setEnabled(true);
                pesquisar_digitado.setEnabled(true);
                salvar_botao.setEnabled(false);
                cancelar_botao.setEnabled(false);
                excluir_botao.setEnabled(false);
                nome_cliente_digitado.setEnabled(false);
                cpf_cliente_digitado.setEnabled(false);
                telefone_cliente_digitado.setEnabled(false);
                nome_pet_digitado.setEnabled(false);
                raca_pet_digitado.setEnabled(false);
                idade_pet_digitado.setEnabled(false);   
            } 
            catch (SQLException ex)
            {  
                JOptionPane.showMessageDialog(null, "Erro ao alterar cliente!\n Erro: " + ex.getMessage());
            }  
            LimparCampos();
            conecta.desconecta();
        }
    }//GEN-LAST:event_editar_botaoActionPerformed

    private void pesquisar_digitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisar_digitadoMouseClicked
        pesquisar_digitado.setText("");
    }//GEN-LAST:event_pesquisar_digitadoMouseClicked

    private void tabela_dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_dadosMouseClicked
        novo_botao.setEnabled(false);
        editar_botao.setEnabled(true);
        salvar_botao.setEnabled(false);
        cancelar_botao.setEnabled(true);
        editar_botao.setEnabled(true);
        excluir_botao.setEnabled(true);
        nome_cliente_digitado.setEnabled(true);
        cpf_cliente_digitado.setEnabled(true);
        telefone_cliente_digitado.setEnabled(true);
        nome_pet_digitado.setEnabled(true);
        raca_pet_digitado.setEnabled(true);
        idade_pet_digitado.setEnabled(true);
        pesquisar_digitado.setEnabled(false);
        consultar_botao.setEnabled(false);
        
        if(tabela_dados.getSelectedRow() != -1)
        {          
            id_cliente.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 0).toString());
            nome_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 1).toString());
            cpf_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 2).toString());
            telefone_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 3).toString());
            nome_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 4).toString());
            raca_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 5).toString());
            idade_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 6).toString());            
        }       
    }//GEN-LAST:event_tabela_dadosMouseClicked

    private void tabela_dadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_dadosKeyReleased
        novo_botao.setEnabled(false);
        editar_botao.setEnabled(true);
        salvar_botao.setEnabled(false);
        cancelar_botao.setEnabled(true);
        editar_botao.setEnabled(true);
        excluir_botao.setEnabled(true);
        nome_cliente_digitado.setEnabled(true);
        cpf_cliente_digitado.setEnabled(true);
        telefone_cliente_digitado.setEnabled(true);
        nome_pet_digitado.setEnabled(true);
        raca_pet_digitado.setEnabled(true);
        idade_pet_digitado.setEnabled(true);
        pesquisar_digitado.setEnabled(false);
        consultar_botao.setEnabled(false);
        
        if(tabela_dados.getSelectedRow() != -1)
        {
            id_cliente.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 0).toString());
            nome_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 1).toString());
            cpf_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 2).toString());
            telefone_cliente_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 3).toString());
            nome_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 4).toString());
            raca_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 5).toString());
            idade_pet_digitado.setText(tabela_dados.getValueAt(tabela_dados.getSelectedRow(), 6).toString());  
        }
    }//GEN-LAST:event_tabela_dadosKeyReleased

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() 
            {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pet_txt;
    private javax.swing.JButton cancelar_botao;
    private javax.swing.JLabel cliente_txt;
    private java.util.List<Interface.Clientes> clientesList;
    private java.util.List<Interface.Clientes> clientesList1;
    private java.util.List<Interface.Clientes> clientesList2;
    private javax.persistence.Query clientesQuery;
    private javax.persistence.Query clientesQuery1;
    private javax.persistence.Query clientesQuery2;
    private javax.swing.JButton consultar_botao;
    private javax.swing.JTextField cpf_cliente_digitado;
    private javax.swing.JLabel cpf_txt;
    private javax.swing.JLabel dog_cat;
    private javax.swing.JButton editar_botao;
    private javax.swing.JButton excluir_botao;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField idade_pet_digitado;
    private javax.swing.JLabel idade_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nome_cliente_digitado;
    private javax.swing.JTextField nome_pet_digitado;
    private javax.swing.JButton novo_botao;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_fundo;
    private javax.swing.JPanel painel_menu;
    private javax.swing.JPanel painel_pesquisar;
    private javax.swing.JPanel painel_pet;
    private javax.swing.JTextField pesquisar_digitado;
    private javax.persistence.EntityManager pet_shopPUEntityManager;
    private javax.swing.JTextField raca_pet_digitado;
    private javax.swing.JLabel raca_txt;
    private javax.swing.JButton salvar_botao;
    private javax.swing.JTable tabela_dados;
    private javax.swing.JTextField telefone_cliente_digitado;
    private javax.swing.JLabel telefone_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}