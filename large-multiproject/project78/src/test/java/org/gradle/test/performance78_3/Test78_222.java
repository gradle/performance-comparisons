package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_222 {
    private final Production78_222 production = new Production78_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}