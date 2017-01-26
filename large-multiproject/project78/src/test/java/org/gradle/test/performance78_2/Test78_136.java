package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_136 {
    private final Production78_136 production = new Production78_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}