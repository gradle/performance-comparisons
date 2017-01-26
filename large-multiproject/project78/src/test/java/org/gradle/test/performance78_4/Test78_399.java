package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_399 {
    private final Production78_399 production = new Production78_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}