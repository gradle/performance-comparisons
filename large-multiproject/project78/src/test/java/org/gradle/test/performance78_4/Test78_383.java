package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_383 {
    private final Production78_383 production = new Production78_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}