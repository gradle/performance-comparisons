package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_311 {
    private final Production29_311 production = new Production29_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}