package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_166 {
    private final Production24_166 production = new Production24_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}