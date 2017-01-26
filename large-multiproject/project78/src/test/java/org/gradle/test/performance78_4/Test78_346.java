package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_346 {
    private final Production78_346 production = new Production78_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}