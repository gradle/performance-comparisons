package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_365 {
    private final Production78_365 production = new Production78_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}