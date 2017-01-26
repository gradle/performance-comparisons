package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_334 {
    private final Production78_334 production = new Production78_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}