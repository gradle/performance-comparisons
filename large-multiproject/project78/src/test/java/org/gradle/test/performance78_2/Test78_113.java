package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_113 {
    private final Production78_113 production = new Production78_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}