package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_407 {
    private final Production78_407 production = new Production78_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}