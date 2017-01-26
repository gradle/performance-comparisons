package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_344 {
    private final Production29_344 production = new Production29_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}