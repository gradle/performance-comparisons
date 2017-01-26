package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_411 {
    private final Production51_411 production = new Production51_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}