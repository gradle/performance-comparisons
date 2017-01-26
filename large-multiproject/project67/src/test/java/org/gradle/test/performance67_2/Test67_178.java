package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_178 {
    private final Production67_178 production = new Production67_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}