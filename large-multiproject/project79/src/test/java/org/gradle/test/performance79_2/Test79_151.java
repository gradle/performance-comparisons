package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_151 {
    private final Production79_151 production = new Production79_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}