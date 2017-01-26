package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_263 {
    private final Production74_263 production = new Production74_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}