package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_344 {
    private final Production78_344 production = new Production78_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}