package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_251 {
    private final Production85_251 production = new Production85_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}