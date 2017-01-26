package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_263 {
    private final Production14_263 production = new Production14_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}