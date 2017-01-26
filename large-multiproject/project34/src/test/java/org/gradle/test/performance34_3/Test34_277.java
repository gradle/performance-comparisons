package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_277 {
    private final Production34_277 production = new Production34_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}