package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_67 {
    private final Production24_67 production = new Production24_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}