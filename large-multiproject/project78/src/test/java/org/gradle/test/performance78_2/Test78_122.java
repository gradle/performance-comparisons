package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_122 {
    private final Production78_122 production = new Production78_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}