package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_330 {
    private final Production85_330 production = new Production85_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}