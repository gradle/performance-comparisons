package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_12 {
    private final Production78_12 production = new Production78_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}