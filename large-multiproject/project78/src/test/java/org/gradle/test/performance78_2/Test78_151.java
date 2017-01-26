package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_151 {
    private final Production78_151 production = new Production78_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}