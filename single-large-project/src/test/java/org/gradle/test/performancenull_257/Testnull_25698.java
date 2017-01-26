package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25698 {
    private final Productionnull_25698 production = new Productionnull_25698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}