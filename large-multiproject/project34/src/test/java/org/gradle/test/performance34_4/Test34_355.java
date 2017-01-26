package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_355 {
    private final Production34_355 production = new Production34_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}