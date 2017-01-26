package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_436 {
    private final Production62_436 production = new Production62_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}