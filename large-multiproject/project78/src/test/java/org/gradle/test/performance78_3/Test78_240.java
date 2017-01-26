package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_240 {
    private final Production78_240 production = new Production78_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}