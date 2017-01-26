package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_127 {
    private final Production78_127 production = new Production78_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}