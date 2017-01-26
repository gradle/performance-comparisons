package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_219 {
    private final Production33_219 production = new Production33_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}