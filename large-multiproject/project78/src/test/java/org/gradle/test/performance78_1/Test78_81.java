package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_81 {
    private final Production78_81 production = new Production78_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}