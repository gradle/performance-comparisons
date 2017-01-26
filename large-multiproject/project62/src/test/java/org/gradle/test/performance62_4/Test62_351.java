package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_351 {
    private final Production62_351 production = new Production62_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}