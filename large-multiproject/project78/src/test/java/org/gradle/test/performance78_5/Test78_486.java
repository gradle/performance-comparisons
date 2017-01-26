package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_486 {
    private final Production78_486 production = new Production78_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}