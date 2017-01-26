package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_100 {
    private final Production78_100 production = new Production78_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}