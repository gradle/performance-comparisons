package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_236 {
    private final Production78_236 production = new Production78_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}