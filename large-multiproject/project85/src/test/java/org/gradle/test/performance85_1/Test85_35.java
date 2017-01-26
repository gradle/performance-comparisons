package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_35 {
    private final Production85_35 production = new Production85_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}