package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_341 {
    private final Production78_341 production = new Production78_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}