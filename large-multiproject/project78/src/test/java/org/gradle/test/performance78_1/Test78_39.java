package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_39 {
    private final Production78_39 production = new Production78_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}