package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_117 {
    private final Production34_117 production = new Production34_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}