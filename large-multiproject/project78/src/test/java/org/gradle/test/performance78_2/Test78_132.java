package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_132 {
    private final Production78_132 production = new Production78_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}