package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_272 {
    private final Production29_272 production = new Production29_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}