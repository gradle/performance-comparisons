package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_410 {
    private final Production78_410 production = new Production78_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}