package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_495 {
    private final Production85_495 production = new Production85_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}