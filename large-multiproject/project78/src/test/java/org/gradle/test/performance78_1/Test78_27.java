package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_27 {
    private final Production78_27 production = new Production78_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}