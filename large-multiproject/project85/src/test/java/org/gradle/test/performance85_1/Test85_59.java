package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_59 {
    private final Production85_59 production = new Production85_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}