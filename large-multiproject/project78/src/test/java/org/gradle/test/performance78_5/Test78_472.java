package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_472 {
    private final Production78_472 production = new Production78_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}