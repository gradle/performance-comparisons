package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_452 {
    private final Production78_452 production = new Production78_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}