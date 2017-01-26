package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_463 {
    private final Production78_463 production = new Production78_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}