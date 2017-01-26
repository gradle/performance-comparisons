package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_8 {
    private final Production78_8 production = new Production78_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}