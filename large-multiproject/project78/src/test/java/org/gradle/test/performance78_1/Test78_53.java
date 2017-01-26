package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_53 {
    private final Production78_53 production = new Production78_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}