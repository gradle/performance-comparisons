package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_175 {
    private final Production78_175 production = new Production78_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}