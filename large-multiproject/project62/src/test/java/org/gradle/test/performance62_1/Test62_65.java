package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_65 {
    private final Production62_65 production = new Production62_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}