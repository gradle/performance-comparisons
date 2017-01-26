package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_447 {
    private final Production62_447 production = new Production62_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}