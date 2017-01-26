package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_54 {
    private final Production62_54 production = new Production62_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}