package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_200 {
    private final Production85_200 production = new Production85_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}