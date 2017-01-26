package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_130 {
    private final Production78_130 production = new Production78_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}