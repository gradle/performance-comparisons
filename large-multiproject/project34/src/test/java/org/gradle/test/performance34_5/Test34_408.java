package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_408 {
    private final Production34_408 production = new Production34_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}