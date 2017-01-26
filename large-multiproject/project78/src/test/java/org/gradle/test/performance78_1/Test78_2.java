package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_2 {
    private final Production78_2 production = new Production78_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}