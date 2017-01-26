package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_321 {
    private final Production78_321 production = new Production78_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}