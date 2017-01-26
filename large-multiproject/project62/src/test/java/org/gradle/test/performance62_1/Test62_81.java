package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_81 {
    private final Production62_81 production = new Production62_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}