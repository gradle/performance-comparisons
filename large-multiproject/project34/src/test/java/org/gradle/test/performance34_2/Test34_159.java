package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_159 {
    private final Production34_159 production = new Production34_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}