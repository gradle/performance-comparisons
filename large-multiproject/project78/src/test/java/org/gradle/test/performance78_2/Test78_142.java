package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_142 {
    private final Production78_142 production = new Production78_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}