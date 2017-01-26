package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_263 {
    private final Production15_263 production = new Production15_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}