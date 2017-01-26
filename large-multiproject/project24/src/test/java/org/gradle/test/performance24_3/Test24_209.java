package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_209 {
    private final Production24_209 production = new Production24_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}