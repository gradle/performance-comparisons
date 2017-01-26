package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_324 {
    private final Production85_324 production = new Production85_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}