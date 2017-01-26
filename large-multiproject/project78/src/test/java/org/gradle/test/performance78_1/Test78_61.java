package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_61 {
    private final Production78_61 production = new Production78_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}