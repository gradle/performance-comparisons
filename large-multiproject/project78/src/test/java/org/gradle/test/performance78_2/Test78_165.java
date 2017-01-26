package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_165 {
    private final Production78_165 production = new Production78_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}