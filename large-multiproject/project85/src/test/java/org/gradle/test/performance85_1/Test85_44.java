package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_44 {
    private final Production85_44 production = new Production85_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}