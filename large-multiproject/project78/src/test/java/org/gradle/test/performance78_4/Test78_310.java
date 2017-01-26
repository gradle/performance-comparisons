package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_310 {
    private final Production78_310 production = new Production78_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}