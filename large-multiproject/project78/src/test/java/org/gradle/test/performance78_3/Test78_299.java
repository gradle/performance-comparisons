package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_299 {
    private final Production78_299 production = new Production78_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}