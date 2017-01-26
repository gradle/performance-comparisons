package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_293 {
    private final Production85_293 production = new Production85_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}