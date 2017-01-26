package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_411 {
    private final Production17_411 production = new Production17_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}