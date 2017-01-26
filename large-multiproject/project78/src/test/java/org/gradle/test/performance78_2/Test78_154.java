package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_154 {
    private final Production78_154 production = new Production78_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}