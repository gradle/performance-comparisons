package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_312 {
    private final Production34_312 production = new Production34_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}