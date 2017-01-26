package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_285 {
    private final Production34_285 production = new Production34_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}