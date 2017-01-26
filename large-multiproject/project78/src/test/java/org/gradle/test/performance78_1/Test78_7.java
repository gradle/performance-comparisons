package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_7 {
    private final Production78_7 production = new Production78_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}