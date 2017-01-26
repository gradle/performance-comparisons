package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_402 {
    private final Production78_402 production = new Production78_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}