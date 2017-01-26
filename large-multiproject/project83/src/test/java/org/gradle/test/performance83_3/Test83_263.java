package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_263 {
    private final Production83_263 production = new Production83_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}