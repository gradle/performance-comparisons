package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_219 {
    private final Production46_219 production = new Production46_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}