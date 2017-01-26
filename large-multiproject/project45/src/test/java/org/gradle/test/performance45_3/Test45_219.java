package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_219 {
    private final Production45_219 production = new Production45_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}