package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49890 {
    private final Productionnull_49890 production = new Productionnull_49890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}