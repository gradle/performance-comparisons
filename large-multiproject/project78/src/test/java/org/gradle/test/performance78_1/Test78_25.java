package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_25 {
    private final Production78_25 production = new Production78_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}