package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_75 {
    private final Production85_75 production = new Production85_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}