package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_358 {
    private final Production78_358 production = new Production78_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}