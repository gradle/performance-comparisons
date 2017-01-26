package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_10 {
    private final Production78_10 production = new Production78_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}