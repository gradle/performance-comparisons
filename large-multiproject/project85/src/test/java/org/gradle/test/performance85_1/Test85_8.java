package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_8 {
    private final Production85_8 production = new Production85_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}