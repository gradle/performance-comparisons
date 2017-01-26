package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_134 {
    private final Production78_134 production = new Production78_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}