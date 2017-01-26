package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_373 {
    private final Production85_373 production = new Production85_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}