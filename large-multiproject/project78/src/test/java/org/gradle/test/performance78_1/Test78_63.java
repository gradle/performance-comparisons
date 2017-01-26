package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_63 {
    private final Production78_63 production = new Production78_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}