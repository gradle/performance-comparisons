package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_263 {
    private final Production37_263 production = new Production37_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}