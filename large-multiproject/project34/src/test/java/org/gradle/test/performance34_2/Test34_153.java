package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_153 {
    private final Production34_153 production = new Production34_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}