package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_313 {
    private final Production78_313 production = new Production78_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}