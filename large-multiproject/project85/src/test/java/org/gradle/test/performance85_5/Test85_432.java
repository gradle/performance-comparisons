package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_432 {
    private final Production85_432 production = new Production85_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}