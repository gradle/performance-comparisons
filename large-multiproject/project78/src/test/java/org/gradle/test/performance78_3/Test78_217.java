package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_217 {
    private final Production78_217 production = new Production78_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}