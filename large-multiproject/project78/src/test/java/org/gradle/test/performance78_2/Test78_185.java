package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_185 {
    private final Production78_185 production = new Production78_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}