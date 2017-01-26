package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_346 {
    private final Production34_346 production = new Production34_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}