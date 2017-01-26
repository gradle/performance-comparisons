package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_262 {
    private final Production78_262 production = new Production78_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}