package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_411 {
    private final Production91_411 production = new Production91_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}