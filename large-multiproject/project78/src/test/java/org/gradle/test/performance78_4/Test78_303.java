package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_303 {
    private final Production78_303 production = new Production78_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}