package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_335 {
    private final Production34_335 production = new Production34_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}