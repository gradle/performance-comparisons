package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_418 {
    private final Production78_418 production = new Production78_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}