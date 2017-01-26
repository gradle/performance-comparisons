package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37082 {
    private final Productionnull_37082 production = new Productionnull_37082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}