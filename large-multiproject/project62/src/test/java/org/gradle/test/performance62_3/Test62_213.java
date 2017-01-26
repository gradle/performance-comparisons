package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_213 {
    private final Production62_213 production = new Production62_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}