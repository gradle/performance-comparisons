package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_375 {
    private final Production78_375 production = new Production78_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}