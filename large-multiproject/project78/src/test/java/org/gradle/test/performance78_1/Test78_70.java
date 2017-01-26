package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_70 {
    private final Production78_70 production = new Production78_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}