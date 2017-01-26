package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_307 {
    private final Production78_307 production = new Production78_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}