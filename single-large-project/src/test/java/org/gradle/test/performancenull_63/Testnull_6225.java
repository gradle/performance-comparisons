package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6225 {
    private final Productionnull_6225 production = new Productionnull_6225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}