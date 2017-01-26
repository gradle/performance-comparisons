package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_408 {
    private final Production78_408 production = new Production78_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}