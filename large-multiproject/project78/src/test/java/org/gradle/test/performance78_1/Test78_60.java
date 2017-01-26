package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_60 {
    private final Production78_60 production = new Production78_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}