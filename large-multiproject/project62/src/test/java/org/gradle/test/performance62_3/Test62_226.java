package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_226 {
    private final Production62_226 production = new Production62_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}