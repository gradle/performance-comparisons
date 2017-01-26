package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_300 {
    private final Production78_300 production = new Production78_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}