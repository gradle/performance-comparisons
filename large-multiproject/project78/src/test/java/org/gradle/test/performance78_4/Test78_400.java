package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_400 {
    private final Production78_400 production = new Production78_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}