package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_254 {
    private final Production62_254 production = new Production62_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}