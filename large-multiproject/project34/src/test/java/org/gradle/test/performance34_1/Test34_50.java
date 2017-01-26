package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_50 {
    private final Production34_50 production = new Production34_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}