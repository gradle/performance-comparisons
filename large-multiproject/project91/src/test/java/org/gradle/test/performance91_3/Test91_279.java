package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_279 {
    private final Production91_279 production = new Production91_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}