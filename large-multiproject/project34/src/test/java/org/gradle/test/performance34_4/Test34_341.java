package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_341 {
    private final Production34_341 production = new Production34_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}