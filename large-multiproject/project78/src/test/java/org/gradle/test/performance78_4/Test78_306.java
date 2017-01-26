package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_306 {
    private final Production78_306 production = new Production78_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}