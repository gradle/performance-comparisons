package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_206 {
    private final Production62_206 production = new Production62_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}