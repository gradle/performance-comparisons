package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_319 {
    private final Production78_319 production = new Production78_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}