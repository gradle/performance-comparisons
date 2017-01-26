package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_243 {
    private final Production78_243 production = new Production78_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}