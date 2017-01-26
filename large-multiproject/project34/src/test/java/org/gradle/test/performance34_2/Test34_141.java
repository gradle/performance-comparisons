package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_141 {
    private final Production34_141 production = new Production34_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}