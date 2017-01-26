package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_170 {
    private final Production78_170 production = new Production78_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}