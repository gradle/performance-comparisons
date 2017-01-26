package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_219 {
    private final Production9_219 production = new Production9_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}