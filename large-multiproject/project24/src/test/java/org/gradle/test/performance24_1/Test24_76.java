package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_76 {
    private final Production24_76 production = new Production24_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}