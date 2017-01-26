package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_270 {
    private final Production78_270 production = new Production78_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}