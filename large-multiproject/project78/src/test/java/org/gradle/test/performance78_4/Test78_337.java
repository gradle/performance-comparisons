package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_337 {
    private final Production78_337 production = new Production78_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}