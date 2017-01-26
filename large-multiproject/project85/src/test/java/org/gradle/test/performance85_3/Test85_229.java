package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_229 {
    private final Production85_229 production = new Production85_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}