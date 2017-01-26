package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_477 {
    private final Production78_477 production = new Production78_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}