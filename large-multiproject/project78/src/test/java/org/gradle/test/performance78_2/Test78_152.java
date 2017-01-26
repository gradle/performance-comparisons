package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_152 {
    private final Production78_152 production = new Production78_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}