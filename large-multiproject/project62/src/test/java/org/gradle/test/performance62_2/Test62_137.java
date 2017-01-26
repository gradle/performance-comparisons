package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_137 {
    private final Production62_137 production = new Production62_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}