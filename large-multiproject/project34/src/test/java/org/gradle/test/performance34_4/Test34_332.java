package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_332 {
    private final Production34_332 production = new Production34_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}