package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_17 {
    private final Production91_17 production = new Production91_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}