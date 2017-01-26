package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_272 {
    private final Production34_272 production = new Production34_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}