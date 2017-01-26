package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_479 {
    private final Production78_479 production = new Production78_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}