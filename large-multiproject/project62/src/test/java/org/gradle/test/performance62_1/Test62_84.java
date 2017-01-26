package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_84 {
    private final Production62_84 production = new Production62_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}