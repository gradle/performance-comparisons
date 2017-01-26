package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_344 {
    private final Production34_344 production = new Production34_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}