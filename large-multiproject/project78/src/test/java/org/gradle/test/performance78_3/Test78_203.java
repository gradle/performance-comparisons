package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_203 {
    private final Production78_203 production = new Production78_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}