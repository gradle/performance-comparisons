package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_352 {
    private final Production78_352 production = new Production78_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}