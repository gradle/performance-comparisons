package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_192 {
    private final Production78_192 production = new Production78_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}