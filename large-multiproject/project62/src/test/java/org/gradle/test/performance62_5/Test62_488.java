package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_488 {
    private final Production62_488 production = new Production62_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}