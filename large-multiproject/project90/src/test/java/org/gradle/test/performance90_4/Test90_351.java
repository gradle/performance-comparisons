package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_351 {
    private final Production90_351 production = new Production90_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}