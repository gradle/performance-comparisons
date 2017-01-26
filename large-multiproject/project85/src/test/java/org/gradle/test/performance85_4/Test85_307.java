package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_307 {
    private final Production85_307 production = new Production85_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}