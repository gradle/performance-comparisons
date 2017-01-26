package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_244 {
    private final Production78_244 production = new Production78_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}