package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_402 {
    private final Production91_402 production = new Production91_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}