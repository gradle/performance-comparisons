package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_84 {
    private final Production78_84 production = new Production78_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}