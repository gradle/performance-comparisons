package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_72 {
    private final Production24_72 production = new Production24_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}