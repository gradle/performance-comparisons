package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_219 {
    private final Production91_219 production = new Production91_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}