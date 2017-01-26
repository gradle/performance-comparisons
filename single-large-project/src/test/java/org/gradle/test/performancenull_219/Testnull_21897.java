package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21897 {
    private final Productionnull_21897 production = new Productionnull_21897("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}