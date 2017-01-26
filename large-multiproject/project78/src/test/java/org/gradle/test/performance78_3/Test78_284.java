package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_284 {
    private final Production78_284 production = new Production78_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}