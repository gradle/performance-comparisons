package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_242 {
    private final Production62_242 production = new Production62_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}