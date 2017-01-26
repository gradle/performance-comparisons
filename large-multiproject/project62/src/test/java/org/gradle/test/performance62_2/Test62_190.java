package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_190 {
    private final Production62_190 production = new Production62_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}