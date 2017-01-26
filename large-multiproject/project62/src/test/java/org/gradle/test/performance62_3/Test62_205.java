package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_205 {
    private final Production62_205 production = new Production62_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}