package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_108 {
    private final Production78_108 production = new Production78_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}