package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_219 {
    private final Production51_219 production = new Production51_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}