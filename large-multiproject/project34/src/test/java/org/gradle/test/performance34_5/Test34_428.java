package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_428 {
    private final Production34_428 production = new Production34_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}