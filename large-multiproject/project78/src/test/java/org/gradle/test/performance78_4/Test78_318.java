package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_318 {
    private final Production78_318 production = new Production78_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}