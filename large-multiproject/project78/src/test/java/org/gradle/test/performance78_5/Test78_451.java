package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_451 {
    private final Production78_451 production = new Production78_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}