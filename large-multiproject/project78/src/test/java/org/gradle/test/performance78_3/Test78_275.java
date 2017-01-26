package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_275 {
    private final Production78_275 production = new Production78_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}