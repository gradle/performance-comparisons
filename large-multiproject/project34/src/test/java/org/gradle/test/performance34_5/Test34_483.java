package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_483 {
    private final Production34_483 production = new Production34_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}