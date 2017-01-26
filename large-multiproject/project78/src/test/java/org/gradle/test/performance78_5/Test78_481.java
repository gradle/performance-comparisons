package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_481 {
    private final Production78_481 production = new Production78_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}