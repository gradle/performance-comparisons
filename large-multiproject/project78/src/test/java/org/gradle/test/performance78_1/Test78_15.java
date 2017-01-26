package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_15 {
    private final Production78_15 production = new Production78_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}