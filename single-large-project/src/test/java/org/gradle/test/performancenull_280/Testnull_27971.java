package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27971 {
    private final Productionnull_27971 production = new Productionnull_27971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}