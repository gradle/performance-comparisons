package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_413 {
    private final Production78_413 production = new Production78_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}