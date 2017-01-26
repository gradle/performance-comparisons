package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_107 {
    private final Production24_107 production = new Production24_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}