package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_218 {
    private final Production78_218 production = new Production78_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}