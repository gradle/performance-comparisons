package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_190 {
    private final Production78_190 production = new Production78_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}