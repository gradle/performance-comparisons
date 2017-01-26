package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_438 {
    private final Production78_438 production = new Production78_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}