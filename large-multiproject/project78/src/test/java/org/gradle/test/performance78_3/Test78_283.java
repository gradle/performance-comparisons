package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_283 {
    private final Production78_283 production = new Production78_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}