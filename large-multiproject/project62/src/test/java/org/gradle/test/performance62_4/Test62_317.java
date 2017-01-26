package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_317 {
    private final Production62_317 production = new Production62_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}