package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_401 {
    private final Production78_401 production = new Production78_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}