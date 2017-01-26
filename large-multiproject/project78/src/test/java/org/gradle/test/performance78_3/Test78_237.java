package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_237 {
    private final Production78_237 production = new Production78_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}