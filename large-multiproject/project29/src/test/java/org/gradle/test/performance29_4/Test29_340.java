package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_340 {
    private final Production29_340 production = new Production29_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}