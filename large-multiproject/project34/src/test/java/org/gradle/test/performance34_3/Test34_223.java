package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_223 {
    private final Production34_223 production = new Production34_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}