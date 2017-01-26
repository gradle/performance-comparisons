package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_57 {
    private final Production78_57 production = new Production78_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}