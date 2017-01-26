package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_256 {
    private final Production78_256 production = new Production78_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}