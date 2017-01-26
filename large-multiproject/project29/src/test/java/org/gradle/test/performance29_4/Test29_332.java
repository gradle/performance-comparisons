package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_332 {
    private final Production29_332 production = new Production29_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}