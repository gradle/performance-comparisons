package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_124 {
    private final Production29_124 production = new Production29_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}