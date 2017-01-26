package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_164 {
    private final Production78_164 production = new Production78_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}