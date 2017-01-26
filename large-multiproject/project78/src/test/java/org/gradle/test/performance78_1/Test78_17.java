package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_17 {
    private final Production78_17 production = new Production78_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}