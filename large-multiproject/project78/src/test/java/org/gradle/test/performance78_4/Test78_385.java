package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_385 {
    private final Production78_385 production = new Production78_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}