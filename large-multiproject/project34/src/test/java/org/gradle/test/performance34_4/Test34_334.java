package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_334 {
    private final Production34_334 production = new Production34_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}