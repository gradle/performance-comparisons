package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_247 {
    private final Production78_247 production = new Production78_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}