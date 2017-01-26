package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_328 {
    private final Production29_328 production = new Production29_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}