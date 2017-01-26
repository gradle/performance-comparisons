package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_41 {
    private final Production85_41 production = new Production85_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}