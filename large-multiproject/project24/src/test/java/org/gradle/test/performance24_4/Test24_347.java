package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_347 {
    private final Production24_347 production = new Production24_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}