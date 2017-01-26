package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_181 {
    private final Production62_181 production = new Production62_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}