package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_103 {
    private final Production78_103 production = new Production78_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}