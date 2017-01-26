package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_252 {
    private final Production78_252 production = new Production78_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}