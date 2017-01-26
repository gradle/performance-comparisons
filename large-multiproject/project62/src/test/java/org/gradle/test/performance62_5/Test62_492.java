package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_492 {
    private final Production62_492 production = new Production62_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}