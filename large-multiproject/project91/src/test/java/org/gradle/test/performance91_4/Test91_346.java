package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_346 {
    private final Production91_346 production = new Production91_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}