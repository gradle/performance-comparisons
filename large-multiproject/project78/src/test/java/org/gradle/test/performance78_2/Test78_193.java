package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_193 {
    private final Production78_193 production = new Production78_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}