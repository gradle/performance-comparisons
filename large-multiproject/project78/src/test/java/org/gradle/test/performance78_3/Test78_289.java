package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_289 {
    private final Production78_289 production = new Production78_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}