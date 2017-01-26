package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_32 {
    private final Production34_32 production = new Production34_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}