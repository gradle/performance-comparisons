package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_232 {
    private final Production78_232 production = new Production78_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}