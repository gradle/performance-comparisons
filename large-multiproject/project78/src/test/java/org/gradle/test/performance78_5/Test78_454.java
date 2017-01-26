package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_454 {
    private final Production78_454 production = new Production78_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}