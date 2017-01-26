package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_298 {
    private final Production34_298 production = new Production34_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}