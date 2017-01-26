package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_327 {
    private final Production34_327 production = new Production34_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}