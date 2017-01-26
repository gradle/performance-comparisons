package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_242 {
    private final Production78_242 production = new Production78_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}