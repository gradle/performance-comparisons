package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_219 {
    private final Production65_219 production = new Production65_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}