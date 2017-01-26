package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_92 {
    private final Production78_92 production = new Production78_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}