package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_279 {
    private final Production78_279 production = new Production78_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}