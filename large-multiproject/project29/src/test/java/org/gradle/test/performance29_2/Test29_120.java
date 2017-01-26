package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_120 {
    private final Production29_120 production = new Production29_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}