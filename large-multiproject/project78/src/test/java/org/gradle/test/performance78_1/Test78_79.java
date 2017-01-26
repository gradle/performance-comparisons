package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_79 {
    private final Production78_79 production = new Production78_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}