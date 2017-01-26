package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_263 {
    private final Production43_263 production = new Production43_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}