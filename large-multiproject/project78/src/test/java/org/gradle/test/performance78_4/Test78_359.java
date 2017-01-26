package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_359 {
    private final Production78_359 production = new Production78_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}