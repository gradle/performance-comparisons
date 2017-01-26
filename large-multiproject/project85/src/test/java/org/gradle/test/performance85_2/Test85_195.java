package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_195 {
    private final Production85_195 production = new Production85_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}