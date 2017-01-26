package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_405 {
    private final Production62_405 production = new Production62_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}