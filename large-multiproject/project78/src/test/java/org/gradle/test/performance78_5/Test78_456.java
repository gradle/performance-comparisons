package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_456 {
    private final Production78_456 production = new Production78_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}