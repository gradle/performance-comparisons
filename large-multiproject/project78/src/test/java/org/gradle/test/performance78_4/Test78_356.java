package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_356 {
    private final Production78_356 production = new Production78_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}