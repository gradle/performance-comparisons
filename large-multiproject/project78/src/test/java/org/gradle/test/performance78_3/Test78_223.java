package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_223 {
    private final Production78_223 production = new Production78_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}