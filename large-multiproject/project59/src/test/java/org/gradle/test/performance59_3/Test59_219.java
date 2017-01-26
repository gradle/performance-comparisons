package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_219 {
    private final Production59_219 production = new Production59_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}