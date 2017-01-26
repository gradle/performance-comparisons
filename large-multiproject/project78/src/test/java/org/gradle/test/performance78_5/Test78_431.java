package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_431 {
    private final Production78_431 production = new Production78_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}