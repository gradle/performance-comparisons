package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_180 {
    private final Production78_180 production = new Production78_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}