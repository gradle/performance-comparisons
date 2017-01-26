package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_97 {
    private final Production24_97 production = new Production24_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}