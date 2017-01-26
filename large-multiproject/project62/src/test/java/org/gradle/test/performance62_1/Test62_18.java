package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_18 {
    private final Production62_18 production = new Production62_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}