package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_351 {
    private final Production60_351 production = new Production60_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}