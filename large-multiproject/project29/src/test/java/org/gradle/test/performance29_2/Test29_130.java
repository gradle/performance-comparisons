package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_130 {
    private final Production29_130 production = new Production29_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}