package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_58 {
    private final Production85_58 production = new Production85_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}