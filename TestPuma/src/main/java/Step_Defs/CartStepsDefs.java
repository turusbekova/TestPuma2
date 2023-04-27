package Step_Defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartStepsDefs {

    @Given("^пользователь в Puma\\.com$")
    public void пользователь_в_Puma_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Пользователь открывает главную страницу сайта https://us\\.puma\\.com$")
    public void пользователь_открывает_главную_страницу_сайта_https_us_puma_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Выбирает любой товар и переходит на его страницу$")
    public void выбирает_любой_товар_и_переходит_на_его_страницу() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Должен нажать кнопку \"([^\"]*)\"$")
    public void должен_нажать_кнопку(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Пользователь проверить, что всплывающее окно с подтверждением добавления товара отображается корректно$")
    public void пользователь_проверить_что_всплывающее_окно_с_подтверждением_добавления_товара_отображается_корректно() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Должен проверить, что количество товаров в корзине увеличилось на (\\d+)$")
    public void должен_проверить_что_количество_товаров_в_корзине_увеличилось_на(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Проверить, что название и цена товара отображаются корректно в корзине$")
    public void проверить_что_название_и_цена_товара_отображаются_корректно_в_корзине() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
       

        @When("^Изменение количества товара в корзине$")
        public void изменение_количества_товара_в_корзине() {
            // Write code here that turns the phrase above into concrete actions
           
        }

        @When("^Нажимает кнопку \"([^\"]*)\" напротив товара$")
        public void нажимает_кнопку_напротив_товара(String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Изменяет количество товара и нажать кнопку \"([^\"]*)\"$")
        public void изменяет_количество_товара_и_нажать_кнопку(String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Проверяет, что количество товара изменилось корректно$")
        public void проверяет_что_количество_товара_изменилось_корректно() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Должен проверить, что цена товара и общая стоимость заказа также изменились корректно$")
        public void должен_проверить_что_цена_товара_и_общая_стоимость_заказа_также_изменились_корректно() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("^Удаление товара из корзины$")
        public void удаление_товара_из_корзины() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Должен проверить, что товар был удален из корзины$")
        public void должен_проверить_что_товар_был_удален_из_корзины() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Проверить, что общая стоимость заказа изменилась корректно$")
        public void проверить_что_общая_стоимость_заказа_изменилась_корректно() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("^Проверка промокодов$")
        public void проверка_промокодов() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("^Вводит действующий промокод и нажимает кнопку \"([^\"]*)\"$")
        public void вводит_действующий_промокод_и_нажимает_кнопку(String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^должен проверить, что скидка была применена корректно$")
        public void должен_проверить_что_скидка_была_применена_корректно() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

    }


