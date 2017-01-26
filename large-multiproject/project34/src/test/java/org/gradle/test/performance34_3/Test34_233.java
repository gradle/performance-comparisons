package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_233 {
    private final Production34_233 production = new Production34_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}