package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_219 {
    private final Production17_219 production = new Production17_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}