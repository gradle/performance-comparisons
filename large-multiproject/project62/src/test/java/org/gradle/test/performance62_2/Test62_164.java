package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_164 {
    private final Production62_164 production = new Production62_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}