package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_56 {
    private final Production78_56 production = new Production78_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}