package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_208 {
    private final Production78_208 production = new Production78_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}