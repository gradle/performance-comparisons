package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_132 {
    private final Production34_132 production = new Production34_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}