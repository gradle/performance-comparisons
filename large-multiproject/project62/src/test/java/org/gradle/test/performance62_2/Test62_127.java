package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_127 {
    private final Production62_127 production = new Production62_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}