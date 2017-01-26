package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_340 {
    private final Production78_340 production = new Production78_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}