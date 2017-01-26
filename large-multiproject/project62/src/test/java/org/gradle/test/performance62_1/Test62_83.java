package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_83 {
    private final Production62_83 production = new Production62_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}