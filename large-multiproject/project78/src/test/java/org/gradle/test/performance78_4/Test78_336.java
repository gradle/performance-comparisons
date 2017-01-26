package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_336 {
    private final Production78_336 production = new Production78_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}