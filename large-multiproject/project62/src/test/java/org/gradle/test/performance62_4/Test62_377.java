package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_377 {
    private final Production62_377 production = new Production62_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}