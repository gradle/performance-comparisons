package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_473 {
    private final Production78_473 production = new Production78_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}