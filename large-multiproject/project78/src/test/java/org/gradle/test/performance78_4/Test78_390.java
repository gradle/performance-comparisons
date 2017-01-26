package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_390 {
    private final Production78_390 production = new Production78_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}