package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_343 {
    private final Production78_343 production = new Production78_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}