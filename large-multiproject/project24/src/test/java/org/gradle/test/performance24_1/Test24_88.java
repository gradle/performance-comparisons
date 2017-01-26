package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_88 {
    private final Production24_88 production = new Production24_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}