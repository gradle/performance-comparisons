package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_54 {
    private final Production78_54 production = new Production78_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}