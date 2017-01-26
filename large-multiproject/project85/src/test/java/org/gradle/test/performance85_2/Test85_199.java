package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_199 {
    private final Production85_199 production = new Production85_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}