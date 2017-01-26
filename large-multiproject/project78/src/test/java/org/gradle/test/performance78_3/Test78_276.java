package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_276 {
    private final Production78_276 production = new Production78_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}