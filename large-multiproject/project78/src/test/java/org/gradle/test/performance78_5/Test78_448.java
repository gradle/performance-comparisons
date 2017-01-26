package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_448 {
    private final Production78_448 production = new Production78_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}