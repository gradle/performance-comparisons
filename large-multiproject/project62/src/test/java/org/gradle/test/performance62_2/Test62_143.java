package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_143 {
    private final Production62_143 production = new Production62_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}