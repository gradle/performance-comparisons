package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_159 {
    private final Production78_159 production = new Production78_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}