package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_359 {
    private final Production34_359 production = new Production34_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}