package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_292 {
    private final Production78_292 production = new Production78_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}