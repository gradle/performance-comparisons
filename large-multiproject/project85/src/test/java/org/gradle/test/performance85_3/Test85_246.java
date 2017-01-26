package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_246 {
    private final Production85_246 production = new Production85_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}