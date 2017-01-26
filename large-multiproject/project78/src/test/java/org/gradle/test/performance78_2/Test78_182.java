package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_182 {
    private final Production78_182 production = new Production78_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}