package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_219 {
    private final Production1_219 production = new Production1_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}