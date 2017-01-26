package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_120 {
    private final Production34_120 production = new Production34_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}