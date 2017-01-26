package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_441 {
    private final Production62_441 production = new Production62_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}