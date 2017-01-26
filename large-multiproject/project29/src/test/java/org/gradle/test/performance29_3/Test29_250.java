package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_250 {
    private final Production29_250 production = new Production29_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}