package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_253 {
    private final Production85_253 production = new Production85_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}