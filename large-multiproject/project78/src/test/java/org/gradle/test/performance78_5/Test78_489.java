package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_489 {
    private final Production78_489 production = new Production78_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}