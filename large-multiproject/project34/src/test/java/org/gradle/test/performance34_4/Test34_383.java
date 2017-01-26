package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_383 {
    private final Production34_383 production = new Production34_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}