package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_388 {
    private final Production78_388 production = new Production78_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}