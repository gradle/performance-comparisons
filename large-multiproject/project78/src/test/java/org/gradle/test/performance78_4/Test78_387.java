package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_387 {
    private final Production78_387 production = new Production78_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}