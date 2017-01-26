package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_178 {
    private final Production78_178 production = new Production78_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}