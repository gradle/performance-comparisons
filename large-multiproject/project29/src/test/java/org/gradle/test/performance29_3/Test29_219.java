package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_219 {
    private final Production29_219 production = new Production29_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}