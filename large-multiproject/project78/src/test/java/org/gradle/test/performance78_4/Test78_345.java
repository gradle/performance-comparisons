package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_345 {
    private final Production78_345 production = new Production78_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}