package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_373 {
    private final Production78_373 production = new Production78_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}