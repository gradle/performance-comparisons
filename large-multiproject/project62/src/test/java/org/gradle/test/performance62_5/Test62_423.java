package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_423 {
    private final Production62_423 production = new Production62_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}