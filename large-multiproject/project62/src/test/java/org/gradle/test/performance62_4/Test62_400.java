package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_400 {
    private final Production62_400 production = new Production62_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}