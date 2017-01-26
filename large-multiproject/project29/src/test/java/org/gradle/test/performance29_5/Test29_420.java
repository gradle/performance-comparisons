package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_420 {
    private final Production29_420 production = new Production29_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}