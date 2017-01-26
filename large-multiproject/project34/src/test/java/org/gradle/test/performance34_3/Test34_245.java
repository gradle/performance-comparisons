package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_245 {
    private final Production34_245 production = new Production34_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}