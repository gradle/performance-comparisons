package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_485 {
    private final Production78_485 production = new Production78_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}