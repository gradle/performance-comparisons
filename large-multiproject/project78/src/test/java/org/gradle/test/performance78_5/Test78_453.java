package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_453 {
    private final Production78_453 production = new Production78_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}