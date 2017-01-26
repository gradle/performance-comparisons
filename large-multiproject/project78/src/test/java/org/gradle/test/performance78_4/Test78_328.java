package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_328 {
    private final Production78_328 production = new Production78_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}