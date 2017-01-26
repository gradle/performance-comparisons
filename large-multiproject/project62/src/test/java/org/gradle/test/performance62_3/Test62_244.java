package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_244 {
    private final Production62_244 production = new Production62_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}