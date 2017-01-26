package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_335 {
    private final Production78_335 production = new Production78_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}