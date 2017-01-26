package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_34 {
    private final Production85_34 production = new Production85_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}