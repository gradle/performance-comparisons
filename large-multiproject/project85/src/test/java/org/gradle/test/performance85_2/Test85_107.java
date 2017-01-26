package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_107 {
    private final Production85_107 production = new Production85_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}