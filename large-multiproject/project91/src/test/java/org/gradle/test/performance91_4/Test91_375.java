package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_375 {
    private final Production91_375 production = new Production91_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}