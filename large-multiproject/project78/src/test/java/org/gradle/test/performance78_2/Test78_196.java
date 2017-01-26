package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_196 {
    private final Production78_196 production = new Production78_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}