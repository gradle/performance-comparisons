package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_171 {
    private final Production78_171 production = new Production78_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}