package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_298 {
    private final Production29_298 production = new Production29_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}