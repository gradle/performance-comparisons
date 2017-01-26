package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_172 {
    private final Production24_172 production = new Production24_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}