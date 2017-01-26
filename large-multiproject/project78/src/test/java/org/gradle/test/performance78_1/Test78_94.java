package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_94 {
    private final Production78_94 production = new Production78_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}