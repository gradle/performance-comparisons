package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_451 {
    private final Production34_451 production = new Production34_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}