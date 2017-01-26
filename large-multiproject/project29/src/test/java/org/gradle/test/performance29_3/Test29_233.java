package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_233 {
    private final Production29_233 production = new Production29_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}