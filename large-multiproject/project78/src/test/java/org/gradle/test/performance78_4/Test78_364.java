package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_364 {
    private final Production78_364 production = new Production78_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}