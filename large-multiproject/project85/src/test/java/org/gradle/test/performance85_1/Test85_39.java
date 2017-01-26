package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_39 {
    private final Production85_39 production = new Production85_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}