package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_263 {
    private final Production38_263 production = new Production38_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}