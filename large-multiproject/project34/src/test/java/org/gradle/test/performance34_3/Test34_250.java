package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_250 {
    private final Production34_250 production = new Production34_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}