package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_292 {
    private final Production34_292 production = new Production34_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}