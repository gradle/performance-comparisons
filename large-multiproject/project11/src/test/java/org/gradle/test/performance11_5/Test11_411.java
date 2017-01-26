package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_411 {
    private final Production11_411 production = new Production11_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}