package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_398 {
    private final Production78_398 production = new Production78_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}