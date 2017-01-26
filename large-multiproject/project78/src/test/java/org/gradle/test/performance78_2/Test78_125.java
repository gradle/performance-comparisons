package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_125 {
    private final Production78_125 production = new Production78_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}