package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_489 {
    private final Production62_489 production = new Production62_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}