package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_22 {
    private final Production34_22 production = new Production34_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}