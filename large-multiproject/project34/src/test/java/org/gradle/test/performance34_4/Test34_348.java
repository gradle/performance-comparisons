package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_348 {
    private final Production34_348 production = new Production34_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}