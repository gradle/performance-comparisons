package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_16 {
    private final Production78_16 production = new Production78_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}