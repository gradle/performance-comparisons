package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_349 {
    private final Production29_349 production = new Production29_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}