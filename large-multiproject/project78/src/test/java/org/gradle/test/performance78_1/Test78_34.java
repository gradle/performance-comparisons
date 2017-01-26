package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_34 {
    private final Production78_34 production = new Production78_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}