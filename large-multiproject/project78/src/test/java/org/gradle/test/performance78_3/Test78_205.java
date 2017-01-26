package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_205 {
    private final Production78_205 production = new Production78_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}