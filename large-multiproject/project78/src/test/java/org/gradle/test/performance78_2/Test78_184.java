package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_184 {
    private final Production78_184 production = new Production78_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}