package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_471 {
    private final Production78_471 production = new Production78_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}