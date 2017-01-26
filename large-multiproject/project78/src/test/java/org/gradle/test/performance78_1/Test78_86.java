package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_86 {
    private final Production78_86 production = new Production78_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}