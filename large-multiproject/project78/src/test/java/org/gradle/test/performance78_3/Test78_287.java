package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_287 {
    private final Production78_287 production = new Production78_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}