package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_419 {
    private final Production78_419 production = new Production78_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}