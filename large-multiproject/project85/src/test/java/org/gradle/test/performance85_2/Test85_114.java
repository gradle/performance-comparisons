package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_114 {
    private final Production85_114 production = new Production85_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}