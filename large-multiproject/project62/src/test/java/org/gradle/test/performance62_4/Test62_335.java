package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_335 {
    private final Production62_335 production = new Production62_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}