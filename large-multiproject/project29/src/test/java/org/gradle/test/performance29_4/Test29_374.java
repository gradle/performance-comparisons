package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_374 {
    private final Production29_374 production = new Production29_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}