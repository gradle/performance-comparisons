package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_478 {
    private final Production34_478 production = new Production34_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}