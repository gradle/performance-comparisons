package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_376 {
    private final Production29_376 production = new Production29_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}