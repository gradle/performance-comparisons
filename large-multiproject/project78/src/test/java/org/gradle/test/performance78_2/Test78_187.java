package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_187 {
    private final Production78_187 production = new Production78_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}