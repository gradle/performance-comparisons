package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_311 {
    private final Production34_311 production = new Production34_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}