package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_10 {
    private final Production85_10 production = new Production85_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}