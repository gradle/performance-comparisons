package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_339 {
    private final Production62_339 production = new Production62_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}