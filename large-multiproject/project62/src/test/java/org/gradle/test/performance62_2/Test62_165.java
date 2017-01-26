package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_165 {
    private final Production62_165 production = new Production62_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}