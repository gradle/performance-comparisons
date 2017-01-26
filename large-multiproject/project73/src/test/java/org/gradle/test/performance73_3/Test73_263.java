package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_263 {
    private final Production73_263 production = new Production73_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}