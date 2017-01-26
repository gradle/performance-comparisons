package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27085 {
    private final Productionnull_27085 production = new Productionnull_27085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}