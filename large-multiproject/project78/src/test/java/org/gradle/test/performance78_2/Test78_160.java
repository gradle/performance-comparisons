package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_160 {
    private final Production78_160 production = new Production78_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}