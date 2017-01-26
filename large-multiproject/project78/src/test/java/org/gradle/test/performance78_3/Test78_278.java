package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_278 {
    private final Production78_278 production = new Production78_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}