package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_349 {
    private final Production78_349 production = new Production78_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}