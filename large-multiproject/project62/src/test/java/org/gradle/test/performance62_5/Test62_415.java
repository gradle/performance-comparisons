package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_415 {
    private final Production62_415 production = new Production62_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}