<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class StudentInfo
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(StudentInfo))
        Me.StudentNameLabel = New System.Windows.Forms.Label()
        Me.MajorLabel = New System.Windows.Forms.Label()
        Me.NameTextBox = New System.Windows.Forms.TextBox()
        Me.MajorTextbox = New System.Windows.Forms.TextBox()
        Me.Display1Button = New System.Windows.Forms.Button()
        Me.Display2Button = New System.Windows.Forms.Button()
        Me.Display3Button = New System.Windows.Forms.Button()
        Me.ResetButton = New System.Windows.Forms.Button()
        Me.PrintButton = New System.Windows.Forms.Button()
        Me.ExitButton = New System.Windows.Forms.Button()
        Me.PrintPreviewDialog1 = New System.Windows.Forms.PrintPreviewDialog()
        Me.SuspendLayout()
        '
        'StudentNameLabel
        '
        Me.StudentNameLabel.AutoSize = True
        Me.StudentNameLabel.Location = New System.Drawing.Point(12, 23)
        Me.StudentNameLabel.Name = "StudentNameLabel"
        Me.StudentNameLabel.Size = New System.Drawing.Size(83, 15)
        Me.StudentNameLabel.TabIndex = 0
        Me.StudentNameLabel.Text = "Student Name"
        '
        'MajorLabel
        '
        Me.MajorLabel.AutoSize = True
        Me.MajorLabel.Location = New System.Drawing.Point(12, 51)
        Me.MajorLabel.Name = "MajorLabel"
        Me.MajorLabel.Size = New System.Drawing.Size(97, 15)
        Me.MajorLabel.TabIndex = 1
        Me.MajorLabel.Text = "Academic Major:"
        '
        'NameTextBox
        '
        Me.NameTextBox.Location = New System.Drawing.Point(120, 23)
        Me.NameTextBox.Name = "NameTextBox"
        Me.NameTextBox.Size = New System.Drawing.Size(276, 23)
        Me.NameTextBox.TabIndex = 2
        '
        'MajorTextbox
        '
        Me.MajorTextbox.Location = New System.Drawing.Point(120, 52)
        Me.MajorTextbox.Name = "MajorTextbox"
        Me.MajorTextbox.Size = New System.Drawing.Size(276, 23)
        Me.MajorTextbox.TabIndex = 3
        '
        'Display1Button
        '
        Me.Display1Button.Location = New System.Drawing.Point(120, 81)
        Me.Display1Button.Name = "Display1Button"
        Me.Display1Button.Size = New System.Drawing.Size(93, 52)
        Me.Display1Button.TabIndex = 4
        Me.Display1Button.Text = "Display Student#&1"
        Me.Display1Button.UseVisualStyleBackColor = True
        '
        'Display2Button
        '
        Me.Display2Button.Location = New System.Drawing.Point(219, 81)
        Me.Display2Button.Name = "Display2Button"
        Me.Display2Button.Size = New System.Drawing.Size(89, 52)
        Me.Display2Button.TabIndex = 5
        Me.Display2Button.Text = "Display Student#&2"
        Me.Display2Button.UseVisualStyleBackColor = True
        '
        'Display3Button
        '
        Me.Display3Button.Location = New System.Drawing.Point(314, 81)
        Me.Display3Button.Name = "Display3Button"
        Me.Display3Button.Size = New System.Drawing.Size(88, 50)
        Me.Display3Button.TabIndex = 6
        Me.Display3Button.Text = "Display Student#&3"
        Me.Display3Button.UseVisualStyleBackColor = True
        '
        'ResetButton
        '
        Me.ResetButton.Location = New System.Drawing.Point(120, 139)
        Me.ResetButton.Name = "ResetButton"
        Me.ResetButton.Size = New System.Drawing.Size(93, 52)
        Me.ResetButton.TabIndex = 7
        Me.ResetButton.Text = "&Reset Form"
        Me.ResetButton.UseVisualStyleBackColor = True
        '
        'PrintButton
        '
        Me.PrintButton.Location = New System.Drawing.Point(219, 139)
        Me.PrintButton.Name = "PrintButton"
        Me.PrintButton.Size = New System.Drawing.Size(93, 52)
        Me.PrintButton.TabIndex = 8
        Me.PrintButton.Text = "&Print Form"
        Me.PrintButton.UseVisualStyleBackColor = True
        '
        'ExitButton
        '
        Me.ExitButton.Location = New System.Drawing.Point(314, 139)
        Me.ExitButton.Name = "ExitButton"
        Me.ExitButton.Size = New System.Drawing.Size(93, 52)
        Me.ExitButton.TabIndex = 9
        Me.ExitButton.Text = "E&xit"
        Me.ExitButton.UseVisualStyleBackColor = True
        '
        'PrintPreviewDialog1
        '
        Me.PrintPreviewDialog1.AutoScrollMargin = New System.Drawing.Size(0, 0)
        Me.PrintPreviewDialog1.AutoScrollMinSize = New System.Drawing.Size(0, 0)
        Me.PrintPreviewDialog1.ClientSize = New System.Drawing.Size(400, 300)
        Me.PrintPreviewDialog1.Enabled = True
        Me.PrintPreviewDialog1.Icon = CType(resources.GetObject("PrintPreviewDialog1.Icon"), System.Drawing.Icon)
        Me.PrintPreviewDialog1.Name = "PrintPreviewDialog1"
        Me.PrintPreviewDialog1.Visible = False
        '
        'StudentInfo
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(715, 286)
        Me.Controls.Add(Me.ExitButton)
        Me.Controls.Add(Me.PrintButton)
        Me.Controls.Add(Me.ResetButton)
        Me.Controls.Add(Me.Display3Button)
        Me.Controls.Add(Me.Display2Button)
        Me.Controls.Add(Me.Display1Button)
        Me.Controls.Add(Me.MajorTextbox)
        Me.Controls.Add(Me.NameTextBox)
        Me.Controls.Add(Me.MajorLabel)
        Me.Controls.Add(Me.StudentNameLabel)
        Me.Name = "StudentInfo"
        Me.Text = "VB Univeristy - Student Information"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents StudentNameLabel As Label
    Friend WithEvents MajorLabel As Label
    Friend WithEvents NameTextBox As TextBox
    Friend WithEvents MajorTextbox As TextBox
    Friend WithEvents Display1Button As Button
    Friend WithEvents Display2Button As Button
    Friend WithEvents Display3Button As Button
    Friend WithEvents ResetButton As Button
    Friend WithEvents PrintButton As Button
    Friend WithEvents ExitButton As Button
    Friend WithEvents PrintPreviewDialog1 As PrintPreviewDialog
End Class
