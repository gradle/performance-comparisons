package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_22 {
    private final Production78_22 production = new Production78_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}