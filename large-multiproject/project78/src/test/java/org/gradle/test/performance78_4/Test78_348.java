package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_348 {
    private final Production78_348 production = new Production78_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}