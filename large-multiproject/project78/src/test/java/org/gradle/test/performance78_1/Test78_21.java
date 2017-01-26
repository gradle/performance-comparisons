package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_21 {
    private final Production78_21 production = new Production78_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}