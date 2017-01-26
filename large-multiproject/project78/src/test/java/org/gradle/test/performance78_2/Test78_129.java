package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_129 {
    private final Production78_129 production = new Production78_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}