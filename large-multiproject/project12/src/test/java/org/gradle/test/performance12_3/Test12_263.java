package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_263 {
    private final Production12_263 production = new Production12_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}