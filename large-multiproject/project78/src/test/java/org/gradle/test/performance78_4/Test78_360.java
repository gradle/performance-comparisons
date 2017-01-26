package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_360 {
    private final Production78_360 production = new Production78_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}