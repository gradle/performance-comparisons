package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_95 {
    private final Production78_95 production = new Production78_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}