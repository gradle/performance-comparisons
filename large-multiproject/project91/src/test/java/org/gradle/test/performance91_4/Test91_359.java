package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_359 {
    private final Production91_359 production = new Production91_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}