package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_202 {
    private final Production85_202 production = new Production85_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}