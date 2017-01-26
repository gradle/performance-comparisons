package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_22 {
    private final Production29_22 production = new Production29_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}