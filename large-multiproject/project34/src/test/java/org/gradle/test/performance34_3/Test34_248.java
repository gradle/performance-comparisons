package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_248 {
    private final Production34_248 production = new Production34_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}