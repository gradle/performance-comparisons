package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_351 {
    private final Production29_351 production = new Production29_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}