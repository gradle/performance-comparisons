package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_381 {
    private final Production78_381 production = new Production78_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}