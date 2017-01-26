package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_466 {
    private final Production78_466 production = new Production78_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}