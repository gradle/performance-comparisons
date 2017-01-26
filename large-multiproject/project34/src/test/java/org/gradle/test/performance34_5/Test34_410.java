package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_410 {
    private final Production34_410 production = new Production34_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}