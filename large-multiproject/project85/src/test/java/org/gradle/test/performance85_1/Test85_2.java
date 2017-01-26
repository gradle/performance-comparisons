package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_2 {
    private final Production85_2 production = new Production85_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}