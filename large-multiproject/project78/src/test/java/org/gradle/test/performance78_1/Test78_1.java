package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_1 {
    private final Production78_1 production = new Production78_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}