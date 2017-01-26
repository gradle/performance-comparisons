package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_41 {
    private final Production24_41 production = new Production24_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}