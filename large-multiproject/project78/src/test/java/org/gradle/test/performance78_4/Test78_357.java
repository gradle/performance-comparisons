package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_357 {
    private final Production78_357 production = new Production78_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}