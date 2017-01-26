package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_459 {
    private final Production78_459 production = new Production78_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}