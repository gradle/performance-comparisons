package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_433 {
    private final Production78_433 production = new Production78_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}