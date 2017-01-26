package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_144 {
    private final Production78_144 production = new Production78_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}