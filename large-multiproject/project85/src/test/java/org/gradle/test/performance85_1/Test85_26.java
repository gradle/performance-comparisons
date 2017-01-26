package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_26 {
    private final Production85_26 production = new Production85_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}