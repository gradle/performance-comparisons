package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_74 {
    private final Production85_74 production = new Production85_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}