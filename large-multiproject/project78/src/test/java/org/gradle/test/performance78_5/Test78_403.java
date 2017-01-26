package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_403 {
    private final Production78_403 production = new Production78_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}