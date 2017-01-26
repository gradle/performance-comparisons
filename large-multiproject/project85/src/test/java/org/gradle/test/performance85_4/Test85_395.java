package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_395 {
    private final Production85_395 production = new Production85_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}