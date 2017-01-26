package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_285 {
    private final Production78_285 production = new Production78_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}