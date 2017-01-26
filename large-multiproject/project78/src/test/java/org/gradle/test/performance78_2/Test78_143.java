package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_143 {
    private final Production78_143 production = new Production78_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}