package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_125 {
    private final Production29_125 production = new Production29_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}