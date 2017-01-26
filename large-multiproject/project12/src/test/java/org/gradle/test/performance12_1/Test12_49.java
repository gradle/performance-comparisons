package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_49 {
    private final Production12_49 production = new Production12_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}