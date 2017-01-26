package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_402 {
    private final Production34_402 production = new Production34_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}