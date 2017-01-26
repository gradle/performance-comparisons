package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_46 {
    private final Production78_46 production = new Production78_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}