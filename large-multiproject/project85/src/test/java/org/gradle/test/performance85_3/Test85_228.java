package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_228 {
    private final Production85_228 production = new Production85_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}