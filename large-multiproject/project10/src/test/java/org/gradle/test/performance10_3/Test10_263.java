package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_263 {
    private final Production10_263 production = new Production10_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}