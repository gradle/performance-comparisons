package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_220 {
    private final Production78_220 production = new Production78_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}