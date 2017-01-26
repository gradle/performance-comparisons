package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_156 {
    private final Production78_156 production = new Production78_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}