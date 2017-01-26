package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_194 {
    private final Production78_194 production = new Production78_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}