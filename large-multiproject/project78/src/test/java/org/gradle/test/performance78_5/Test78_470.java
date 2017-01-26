package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_470 {
    private final Production78_470 production = new Production78_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}