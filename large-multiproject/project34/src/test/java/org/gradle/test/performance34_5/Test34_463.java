package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_463 {
    private final Production34_463 production = new Production34_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}