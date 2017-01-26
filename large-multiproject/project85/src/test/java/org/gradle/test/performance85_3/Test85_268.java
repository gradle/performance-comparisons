package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_268 {
    private final Production85_268 production = new Production85_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}