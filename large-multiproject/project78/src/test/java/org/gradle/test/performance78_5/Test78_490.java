package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_490 {
    private final Production78_490 production = new Production78_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}