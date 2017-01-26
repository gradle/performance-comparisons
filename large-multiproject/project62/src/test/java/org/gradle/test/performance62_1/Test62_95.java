package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_95 {
    private final Production62_95 production = new Production62_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}