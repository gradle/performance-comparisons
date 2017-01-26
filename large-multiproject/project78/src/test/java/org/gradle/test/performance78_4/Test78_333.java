package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_333 {
    private final Production78_333 production = new Production78_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}