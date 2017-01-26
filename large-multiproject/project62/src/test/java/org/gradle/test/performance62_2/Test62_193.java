package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_193 {
    private final Production62_193 production = new Production62_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}