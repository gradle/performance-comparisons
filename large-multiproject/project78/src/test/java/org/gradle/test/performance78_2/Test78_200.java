package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_200 {
    private final Production78_200 production = new Production78_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}