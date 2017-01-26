package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_263 {
    private final Production93_263 production = new Production93_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}