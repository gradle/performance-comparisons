package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_211 {
    private final Production78_211 production = new Production78_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}