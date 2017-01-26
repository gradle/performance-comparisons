package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_423 {
    private final Production78_423 production = new Production78_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}