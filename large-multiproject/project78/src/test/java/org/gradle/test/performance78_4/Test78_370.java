package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_370 {
    private final Production78_370 production = new Production78_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}