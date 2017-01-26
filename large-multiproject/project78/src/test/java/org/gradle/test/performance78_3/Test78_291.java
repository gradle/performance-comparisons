package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_291 {
    private final Production78_291 production = new Production78_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}