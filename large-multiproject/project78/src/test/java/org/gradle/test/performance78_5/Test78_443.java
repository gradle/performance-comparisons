package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_443 {
    private final Production78_443 production = new Production78_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}