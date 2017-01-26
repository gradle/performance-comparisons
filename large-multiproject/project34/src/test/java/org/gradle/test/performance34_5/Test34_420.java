package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_420 {
    private final Production34_420 production = new Production34_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}