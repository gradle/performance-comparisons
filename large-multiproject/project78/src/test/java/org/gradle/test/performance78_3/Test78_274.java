package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_274 {
    private final Production78_274 production = new Production78_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}