package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_491 {
    private final Production78_491 production = new Production78_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}