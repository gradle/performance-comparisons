package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_249 {
    private final Production62_249 production = new Production62_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}