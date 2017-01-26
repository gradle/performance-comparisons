package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_42 {
    private final Production85_42 production = new Production85_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}