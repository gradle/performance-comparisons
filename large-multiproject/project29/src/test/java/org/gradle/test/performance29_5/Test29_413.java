package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_413 {
    private final Production29_413 production = new Production29_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}