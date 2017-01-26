package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_263 {
    private final Production39_263 production = new Production39_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}