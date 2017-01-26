package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_220 {
    private final Production85_220 production = new Production85_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}