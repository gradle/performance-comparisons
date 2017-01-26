package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_462 {
    private final Production62_462 production = new Production62_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}