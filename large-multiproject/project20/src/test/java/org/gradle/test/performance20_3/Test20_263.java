package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_263 {
    private final Production20_263 production = new Production20_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}