package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_137 {
    private final Production78_137 production = new Production78_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}