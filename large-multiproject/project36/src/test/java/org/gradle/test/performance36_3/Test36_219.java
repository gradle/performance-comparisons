package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_219 {
    private final Production36_219 production = new Production36_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}