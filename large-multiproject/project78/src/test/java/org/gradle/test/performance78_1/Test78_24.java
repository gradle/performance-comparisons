package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_24 {
    private final Production78_24 production = new Production78_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}