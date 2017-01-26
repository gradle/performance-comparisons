package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_262 {
    private final Production34_262 production = new Production34_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}