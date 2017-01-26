package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_397 {
    private final Production78_397 production = new Production78_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}