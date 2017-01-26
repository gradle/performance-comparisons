package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_276 {
    private final Production29_276 production = new Production29_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}