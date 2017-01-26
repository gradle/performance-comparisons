package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_263 {
    private final Production67_263 production = new Production67_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}