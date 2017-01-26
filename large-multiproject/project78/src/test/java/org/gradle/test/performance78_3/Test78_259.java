package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_259 {
    private final Production78_259 production = new Production78_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}