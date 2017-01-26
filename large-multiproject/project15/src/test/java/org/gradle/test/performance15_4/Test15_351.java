package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_351 {
    private final Production15_351 production = new Production15_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}