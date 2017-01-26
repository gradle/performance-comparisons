package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_219 {
    private final Production60_219 production = new Production60_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}