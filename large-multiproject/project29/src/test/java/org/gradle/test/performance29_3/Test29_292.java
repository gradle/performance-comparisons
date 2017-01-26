package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_292 {
    private final Production29_292 production = new Production29_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}