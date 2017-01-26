package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_281 {
    private final Production85_281 production = new Production85_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}