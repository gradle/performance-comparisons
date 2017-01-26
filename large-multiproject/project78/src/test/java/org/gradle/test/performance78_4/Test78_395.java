package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_395 {
    private final Production78_395 production = new Production78_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}