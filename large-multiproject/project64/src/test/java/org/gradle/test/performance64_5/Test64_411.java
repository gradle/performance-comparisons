package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_411 {
    private final Production64_411 production = new Production64_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}