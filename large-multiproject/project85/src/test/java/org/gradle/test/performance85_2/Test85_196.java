package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_196 {
    private final Production85_196 production = new Production85_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}