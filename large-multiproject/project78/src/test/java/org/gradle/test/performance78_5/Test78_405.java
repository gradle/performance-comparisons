package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_405 {
    private final Production78_405 production = new Production78_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}