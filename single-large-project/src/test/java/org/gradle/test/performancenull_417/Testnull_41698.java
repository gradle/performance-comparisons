package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41698 {
    private final Productionnull_41698 production = new Productionnull_41698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}