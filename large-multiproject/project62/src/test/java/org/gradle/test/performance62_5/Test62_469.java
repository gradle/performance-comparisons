package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_469 {
    private final Production62_469 production = new Production62_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}