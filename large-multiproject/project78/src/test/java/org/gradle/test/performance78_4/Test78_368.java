package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_368 {
    private final Production78_368 production = new Production78_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}