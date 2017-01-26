package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_263 {
    private final Production49_263 production = new Production49_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}