package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_273 {
    private final Production78_273 production = new Production78_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}