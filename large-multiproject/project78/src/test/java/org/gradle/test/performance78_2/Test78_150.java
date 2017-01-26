package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_150 {
    private final Production78_150 production = new Production78_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}