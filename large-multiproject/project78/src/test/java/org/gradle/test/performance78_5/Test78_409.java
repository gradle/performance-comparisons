package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_409 {
    private final Production78_409 production = new Production78_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}