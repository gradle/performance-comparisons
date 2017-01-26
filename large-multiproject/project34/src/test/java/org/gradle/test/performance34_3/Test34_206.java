package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_206 {
    private final Production34_206 production = new Production34_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}