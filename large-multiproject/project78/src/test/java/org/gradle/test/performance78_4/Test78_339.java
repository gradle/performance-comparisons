package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_339 {
    private final Production78_339 production = new Production78_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}