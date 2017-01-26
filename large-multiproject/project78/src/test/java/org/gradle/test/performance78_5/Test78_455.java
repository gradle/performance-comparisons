package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_455 {
    private final Production78_455 production = new Production78_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}