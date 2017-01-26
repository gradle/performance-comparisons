package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_458 {
    private final Production85_458 production = new Production85_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}