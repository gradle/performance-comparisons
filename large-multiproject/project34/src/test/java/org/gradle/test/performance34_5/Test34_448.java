package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_448 {
    private final Production34_448 production = new Production34_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}