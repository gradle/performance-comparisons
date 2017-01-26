package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_31 {
    private final Production78_31 production = new Production78_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}