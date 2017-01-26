package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_406 {
    private final Production12_406 production = new Production12_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}