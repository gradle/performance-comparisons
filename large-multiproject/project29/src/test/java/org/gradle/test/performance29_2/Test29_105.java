package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_105 {
    private final Production29_105 production = new Production29_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}