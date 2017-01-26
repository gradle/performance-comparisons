package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_58 {
    private final Production24_58 production = new Production24_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}