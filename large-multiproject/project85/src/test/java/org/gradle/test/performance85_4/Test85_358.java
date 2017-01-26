package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_358 {
    private final Production85_358 production = new Production85_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}