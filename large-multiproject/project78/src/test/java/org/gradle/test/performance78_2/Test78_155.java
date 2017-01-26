package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_155 {
    private final Production78_155 production = new Production78_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}