package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_452 {
    private final Production29_452 production = new Production29_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}