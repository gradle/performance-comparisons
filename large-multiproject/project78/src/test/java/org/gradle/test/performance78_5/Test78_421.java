package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_421 {
    private final Production78_421 production = new Production78_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}