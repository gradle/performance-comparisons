package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_219 {
    private final Production19_219 production = new Production19_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}