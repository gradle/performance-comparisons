package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_105 {
    private final Production78_105 production = new Production78_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}