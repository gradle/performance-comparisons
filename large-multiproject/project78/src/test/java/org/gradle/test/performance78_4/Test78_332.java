package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_332 {
    private final Production78_332 production = new Production78_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}