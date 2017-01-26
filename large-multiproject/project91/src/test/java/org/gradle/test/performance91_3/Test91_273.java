package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_273 {
    private final Production91_273 production = new Production91_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}