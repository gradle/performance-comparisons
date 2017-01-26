package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_467 {
    private final Production78_467 production = new Production78_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}