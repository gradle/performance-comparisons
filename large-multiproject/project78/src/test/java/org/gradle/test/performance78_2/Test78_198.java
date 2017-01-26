package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_198 {
    private final Production78_198 production = new Production78_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}