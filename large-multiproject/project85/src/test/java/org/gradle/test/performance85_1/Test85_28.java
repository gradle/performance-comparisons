package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_28 {
    private final Production85_28 production = new Production85_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}