package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_169 {
    private final Production78_169 production = new Production78_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}