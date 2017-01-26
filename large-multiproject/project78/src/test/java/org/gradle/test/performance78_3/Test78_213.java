package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_213 {
    private final Production78_213 production = new Production78_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}