package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_263 {
    private final Production9_263 production = new Production9_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}