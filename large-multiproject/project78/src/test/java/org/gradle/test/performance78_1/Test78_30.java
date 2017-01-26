package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_30 {
    private final Production78_30 production = new Production78_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}