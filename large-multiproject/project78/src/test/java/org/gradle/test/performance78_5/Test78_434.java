package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_434 {
    private final Production78_434 production = new Production78_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}