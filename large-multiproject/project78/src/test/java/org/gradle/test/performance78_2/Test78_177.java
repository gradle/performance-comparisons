package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_177 {
    private final Production78_177 production = new Production78_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}