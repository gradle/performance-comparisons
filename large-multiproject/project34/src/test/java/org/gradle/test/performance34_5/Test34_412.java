package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_412 {
    private final Production34_412 production = new Production34_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}