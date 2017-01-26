package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_5 {
    private final Production78_5 production = new Production78_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}