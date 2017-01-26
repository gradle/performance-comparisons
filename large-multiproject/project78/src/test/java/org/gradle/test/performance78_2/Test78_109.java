package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_109 {
    private final Production78_109 production = new Production78_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}