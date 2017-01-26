package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_429 {
    private final Production78_429 production = new Production78_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}