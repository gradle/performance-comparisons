package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_279 {
    private final Production34_279 production = new Production34_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}