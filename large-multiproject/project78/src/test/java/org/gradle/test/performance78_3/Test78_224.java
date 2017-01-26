package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_224 {
    private final Production78_224 production = new Production78_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}