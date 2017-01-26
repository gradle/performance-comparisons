package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_260 {
    private final Production78_260 production = new Production78_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}