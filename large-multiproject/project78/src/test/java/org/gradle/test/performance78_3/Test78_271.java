package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_271 {
    private final Production78_271 production = new Production78_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}