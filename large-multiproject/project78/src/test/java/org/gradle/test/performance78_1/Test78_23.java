package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_23 {
    private final Production78_23 production = new Production78_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}