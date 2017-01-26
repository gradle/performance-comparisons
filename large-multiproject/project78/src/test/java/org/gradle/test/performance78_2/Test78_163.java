package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_163 {
    private final Production78_163 production = new Production78_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}