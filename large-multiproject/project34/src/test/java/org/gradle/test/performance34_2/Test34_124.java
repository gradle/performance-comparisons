package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_124 {
    private final Production34_124 production = new Production34_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}