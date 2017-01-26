package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_312 {
    private final Production78_312 production = new Production78_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}