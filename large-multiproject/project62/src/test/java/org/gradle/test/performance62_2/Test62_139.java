package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_139 {
    private final Production62_139 production = new Production62_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}