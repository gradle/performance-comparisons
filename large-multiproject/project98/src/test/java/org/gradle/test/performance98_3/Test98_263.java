package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_263 {
    private final Production98_263 production = new Production98_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}