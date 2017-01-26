package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_392 {
    private final Production85_392 production = new Production85_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}