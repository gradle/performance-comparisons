package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_410 {
    private final Production91_410 production = new Production91_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}