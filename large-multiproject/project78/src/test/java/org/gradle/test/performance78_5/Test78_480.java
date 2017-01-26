package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_480 {
    private final Production78_480 production = new Production78_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}