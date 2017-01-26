package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_312 {
    private final Production91_312 production = new Production91_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}