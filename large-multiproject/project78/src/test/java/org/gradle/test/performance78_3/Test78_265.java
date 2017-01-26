package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_265 {
    private final Production78_265 production = new Production78_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}