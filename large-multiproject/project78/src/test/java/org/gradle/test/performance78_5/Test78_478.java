package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_478 {
    private final Production78_478 production = new Production78_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}