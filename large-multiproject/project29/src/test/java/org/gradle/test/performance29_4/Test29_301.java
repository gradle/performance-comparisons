package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_301 {
    private final Production29_301 production = new Production29_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}