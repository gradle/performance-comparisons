package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_273 {
    private final Production34_273 production = new Production34_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}