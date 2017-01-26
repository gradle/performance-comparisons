package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_370 {
    private final Production34_370 production = new Production34_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}