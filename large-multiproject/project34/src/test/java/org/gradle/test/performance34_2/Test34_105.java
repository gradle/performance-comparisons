package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_105 {
    private final Production34_105 production = new Production34_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}