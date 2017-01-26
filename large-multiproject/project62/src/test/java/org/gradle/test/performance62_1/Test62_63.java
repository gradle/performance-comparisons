package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_63 {
    private final Production62_63 production = new Production62_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}