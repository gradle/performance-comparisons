package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_301 {
    private final Production78_301 production = new Production78_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}