package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_328 {
    private final Production34_328 production = new Production34_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}