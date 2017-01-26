package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17183 {
    private final Productionnull_17183 production = new Productionnull_17183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}