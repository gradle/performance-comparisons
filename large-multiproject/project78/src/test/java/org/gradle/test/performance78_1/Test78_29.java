package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_29 {
    private final Production78_29 production = new Production78_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}