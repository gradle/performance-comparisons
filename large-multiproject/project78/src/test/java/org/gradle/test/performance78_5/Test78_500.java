package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_500 {
    private final Production78_500 production = new Production78_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}