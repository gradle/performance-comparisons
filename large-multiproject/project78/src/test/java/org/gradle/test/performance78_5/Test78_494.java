package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_494 {
    private final Production78_494 production = new Production78_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}