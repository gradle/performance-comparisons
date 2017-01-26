package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_117 {
    private final Production78_117 production = new Production78_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}