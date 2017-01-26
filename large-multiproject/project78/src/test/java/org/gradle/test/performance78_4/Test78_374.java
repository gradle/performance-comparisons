package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_374 {
    private final Production78_374 production = new Production78_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}