package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_488 {
    private final Production78_488 production = new Production78_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}