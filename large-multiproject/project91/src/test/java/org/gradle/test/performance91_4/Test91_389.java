package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_389 {
    private final Production91_389 production = new Production91_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}