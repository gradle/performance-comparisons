package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_245 {
    private final Production78_245 production = new Production78_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}