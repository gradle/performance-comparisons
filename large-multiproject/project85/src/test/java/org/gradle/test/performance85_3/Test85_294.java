package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_294 {
    private final Production85_294 production = new Production85_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}