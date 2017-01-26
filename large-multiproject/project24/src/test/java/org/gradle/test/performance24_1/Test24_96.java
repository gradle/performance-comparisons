package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_96 {
    private final Production24_96 production = new Production24_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}