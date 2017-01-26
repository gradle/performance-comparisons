package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_61 {
    private final Production85_61 production = new Production85_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}