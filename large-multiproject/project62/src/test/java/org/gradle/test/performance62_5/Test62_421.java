package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_421 {
    private final Production62_421 production = new Production62_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}