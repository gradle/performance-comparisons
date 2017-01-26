package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_26 {
    private final Production78_26 production = new Production78_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}