package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_312 {
    private final Production29_312 production = new Production29_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}