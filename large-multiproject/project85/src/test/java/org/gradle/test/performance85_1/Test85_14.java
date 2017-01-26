package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_14 {
    private final Production85_14 production = new Production85_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}