package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_233 {
    private final Production78_233 production = new Production78_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}