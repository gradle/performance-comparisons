package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_363 {
    private final Production34_363 production = new Production34_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}