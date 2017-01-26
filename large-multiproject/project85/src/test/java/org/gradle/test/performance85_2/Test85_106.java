package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_106 {
    private final Production85_106 production = new Production85_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}