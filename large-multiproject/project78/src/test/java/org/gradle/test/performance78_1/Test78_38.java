package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_38 {
    private final Production78_38 production = new Production78_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}