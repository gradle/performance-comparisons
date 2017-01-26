package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_139 {
    private final Production78_139 production = new Production78_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}