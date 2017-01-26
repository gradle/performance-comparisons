package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_263 {
    private final Production59_263 production = new Production59_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}