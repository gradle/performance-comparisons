package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_240 {
    private final Production34_240 production = new Production34_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}