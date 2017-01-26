package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_319 {
    private final Production34_319 production = new Production34_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}