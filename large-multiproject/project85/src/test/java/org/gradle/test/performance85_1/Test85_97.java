package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_97 {
    private final Production85_97 production = new Production85_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}