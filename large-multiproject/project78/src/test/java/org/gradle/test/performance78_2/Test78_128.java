package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_128 {
    private final Production78_128 production = new Production78_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}