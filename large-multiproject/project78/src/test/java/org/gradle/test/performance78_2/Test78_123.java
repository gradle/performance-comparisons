package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_123 {
    private final Production78_123 production = new Production78_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}