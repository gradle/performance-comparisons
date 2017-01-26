package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_446 {
    private final Production15_446 production = new Production15_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}