package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_280 {
    private final Production34_280 production = new Production34_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}