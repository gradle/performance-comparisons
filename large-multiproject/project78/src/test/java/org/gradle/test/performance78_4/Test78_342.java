package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_342 {
    private final Production78_342 production = new Production78_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}