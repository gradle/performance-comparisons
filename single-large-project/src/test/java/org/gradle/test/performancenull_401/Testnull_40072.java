package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40072 {
    private final Productionnull_40072 production = new Productionnull_40072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}