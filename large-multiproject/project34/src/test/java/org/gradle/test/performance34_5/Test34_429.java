package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_429 {
    private final Production34_429 production = new Production34_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}