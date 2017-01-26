package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_131 {
    private final Production78_131 production = new Production78_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}