package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_188 {
    private final Production85_188 production = new Production85_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}