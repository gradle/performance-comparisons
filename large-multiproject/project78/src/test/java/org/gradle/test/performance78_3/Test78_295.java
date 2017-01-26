package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_295 {
    private final Production78_295 production = new Production78_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}