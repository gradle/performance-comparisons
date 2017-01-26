package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_140 {
    private final Production85_140 production = new Production85_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}