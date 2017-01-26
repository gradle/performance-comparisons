package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_263 {
    private final Production81_263 production = new Production81_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}