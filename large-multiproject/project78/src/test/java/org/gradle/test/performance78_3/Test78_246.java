package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_246 {
    private final Production78_246 production = new Production78_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}