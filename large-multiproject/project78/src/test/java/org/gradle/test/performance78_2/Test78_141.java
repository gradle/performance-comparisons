package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_141 {
    private final Production78_141 production = new Production78_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}