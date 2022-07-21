Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs)
        MessageBox.Show("Hello World", "Greetings")
        Try
            Dim Retail As Decimal
            Dim Quantity As Integer
            Dim WholeSale As Decimal
            Dim GrossProfit As Decimal
            Dim NetProfit As Decimal
            Dim StorageCharges As Decimal
            Const StorageChargesRate As Single = 0.05

            Quantity = Integer.Parse(QuantityTextBox.Text)
            WholeSale = Decimal.Parse(WholesaleTextBox.Text)
            Retail = Decimal.Parse(RetailPriceTextBox.Text)

            GrossProfit = Quantity * (Retail - WholeSale)
            StorageCharges = StorageChargesRate * GrossProfit
            NetProfit = GrossProfit - StorageCharges

            GrossProfitTextBox.Text = GrossProfit.ToString("n2")
            NetProfitTextBox.Text = NetProfit.ToString("n2")
            StorageChargesTextBox.Text = StorageCharges.ToString("n2")

        Catch ex As Exception
            MessageBox.Show("Error in Retail Price, WholeSale Cost, or Quantity")

        End Try

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles ExitButton.Click

    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles PrintButton.Click

    End Sub
End Class
