package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_411 {
    private final Production59_411 production = new Production59_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}