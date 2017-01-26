package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_464 {
    private final Production29_464 production = new Production29_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}