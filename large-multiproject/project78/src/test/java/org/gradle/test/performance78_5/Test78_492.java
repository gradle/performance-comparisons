package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_492 {
    private final Production78_492 production = new Production78_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}