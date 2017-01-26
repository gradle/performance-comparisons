package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_148 {
    private final Production78_148 production = new Production78_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}