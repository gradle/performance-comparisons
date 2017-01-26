package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_168 {
    private final Production24_168 production = new Production24_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}