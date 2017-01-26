package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_254 {
    private final Production78_254 production = new Production78_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}