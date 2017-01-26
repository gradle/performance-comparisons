package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_450 {
    private final Production78_450 production = new Production78_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}