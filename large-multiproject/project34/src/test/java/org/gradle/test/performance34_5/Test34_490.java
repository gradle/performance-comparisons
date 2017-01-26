package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_490 {
    private final Production34_490 production = new Production34_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}