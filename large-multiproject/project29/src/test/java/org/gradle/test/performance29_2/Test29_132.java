package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_132 {
    private final Production29_132 production = new Production29_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}