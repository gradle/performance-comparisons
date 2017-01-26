package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_426 {
    private final Production78_426 production = new Production78_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}