package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_20 {
    private final Production78_20 production = new Production78_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}