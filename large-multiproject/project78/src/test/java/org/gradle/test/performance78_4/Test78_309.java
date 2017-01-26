package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_309 {
    private final Production78_309 production = new Production78_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}