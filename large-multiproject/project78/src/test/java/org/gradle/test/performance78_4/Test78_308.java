package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_308 {
    private final Production78_308 production = new Production78_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}