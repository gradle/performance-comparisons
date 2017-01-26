package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_290 {
    private final Production78_290 production = new Production78_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}