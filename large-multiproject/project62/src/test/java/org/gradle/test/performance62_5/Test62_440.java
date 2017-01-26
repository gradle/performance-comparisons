package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_440 {
    private final Production62_440 production = new Production62_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}