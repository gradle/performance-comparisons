package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_162 {
    private final Production62_162 production = new Production62_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}