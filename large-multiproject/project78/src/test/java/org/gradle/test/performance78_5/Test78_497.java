package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_497 {
    private final Production78_497 production = new Production78_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}